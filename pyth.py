import matplotlib.pyplot as plt
import matplotlib.patches as patches
import matplotlib.pyplot as plt

# Function to draw the Indian Flag
def draw_indian_flag():
    # Create figure and axis
    fig, ax = plt.subplots()

    # Set the figure size
    fig.set_size_inches(10, 7)

    # Draw the orange rectangle (top)
    ax.add_patch(patches.Rectangle((0, 2/3), 3/2, 1/3, edgecolor='none', facecolor='#FF9933'))

    # Draw the white rectangle (middle)
    ax.add_patch(patches.Rectangle((0, 1/3), 3/2, 1/3, edgecolor='none', facecolor='white'))

    # Draw the green rectangle (bottom)
    ax.add_patch(patches.Rectangle((0, 0), 3/2, 1/3, edgecolor='none', facecolor='#138808'))

    # Draw the Ashoka Chakra (circle in the center)
    chakra_radius = 0.15  # Radius of the Ashoka Chakra
    ax.add_patch(patches.Circle((3/4, 1/2), chakra_radius, edgecolor='none', facecolor='#000080'))

    # Draw the 24 spokes of the Ashoka Chakra
    for i in range(24):
        angle = (i * 360 / 24) * (3.14159 / 180)
        x = 3/4 + chakra_radius * 0.9 * np.cos(angle)
        y = 1/2 + chakra_radius * 0.9 * np.sin(angle)
        ax.plot([3/4, x], [1/2, y], color='white', lw=1)

    # Set limits and aspect ratio
    ax.set_xlim(0, 3/2)
    ax.set_ylim(0, 1)
    ax.set_aspect(2)

    # Hide axes
    ax.axis('off')

    # Display the flag
    plt.show()

# Import necessary libraries
import numpy as np

# Call the function to draw the Indian Flag
draw_indian_flag()
