# SocialInteractionsServiceHook for Forge 1.16.5

## Overview
`SocialInteractionsServiceHook` is a Forge 1.16.5 hook that removes the restriction on using the in-game chat when running your mod through an IDE, such as IntelliJ IDEA. This project leverages reflection to modify private fields within the Minecraft class, ensuring compatibility across different mappings versions.

## Installation

1. Clone or download the repository.
2. Include the provided hook in your mod's launch configuration.

## Usage

To unlock the chat feature, add the following code snippet to your mod's initialization or startup process:

```java
try {
    ObfuscationReflectionHelper.setPrivateValue(
        Minecraft.class, 
        Minecraft.getInstance(), 
        new SocialInteractionsServiceHook(), 
        "field_244734_au"
    );
} catch (Exception ignored) {
    // Handle or log exceptions if needed
}
