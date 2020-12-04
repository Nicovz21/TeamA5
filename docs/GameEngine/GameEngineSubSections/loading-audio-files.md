---
layout: default
title: Loading Audio Files
parent: Game Engine
nav_order: 5
permalink: /GameEngine/LoadingAudioFiles
---

# Navigation Structure
{: .no_toc }

## Table of contents
{: .no_toc .text-delta }

1. TOC
{:toc}

---

#Loading Audio Files

######Concept borrowed from: https://www.geeksforgeeks.org/play-audio-file-using-java/
The engine's `AudioPlayer` class has methods that will read an audio file into the game using the `Clip` interface.

The Audio Player provides seven methods, all with pretty straightforward names:
- **play** -- play the audio clip
- **pause** -- pause the audio clip
- **resumeAudio** -- resume the audio clip from the paused timestamp
- **restart** -- go back to the beginning of the audio clip
- **stop** -- stop playing the audio clip and close it
- **jump** -- skip over a specific part of and audio clip and continue playing
- **resetAudioStream** -- resets the audio clip

Pass the method an image file and it will read it in, no questions asked.

## AudioFiles Directory

The `AudioPlayer` class will look for audio files relative to the directory defined as the `AUDIO_FILES_PATH`,
which is set in the `Config` class. By default, it is set to a `AudioFiles/` directory at the root of the project.
If an image is placed in that `AudioFiles/` directory named "music.wav", the file name can be used to create a new
player associated with that particular audio file and be played using the methods of the `AudioPlayer` class.

```java
        //start music
        try {
            audioPlayer = new AudioPlayer("Stage1_Grasslands.wav", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
```

Notice that next to the file path is a boolean variable. This determines if the sound/song loops or not.
And ***An important sidenote:*** if the track does not loop, you will have to call the audio player's `play();`
method in the try block to have it play.

### Changing Audio directory

This is basically the same as it is for images in the previous section, so just use that as a reference.


### Adding songs to the folder

An important thing to note when adding sounds/songs: the .wav file must have a 16-bit PCM when you export
it from wherever you do, or else the sound/music will not play and the game will get angry at you. If you're
making the music/sound in a DAW (Digital Audio Workstation) there's usually an option you can select when exporting
to make is 16-bit PCM instead of 24-bit (which was the default for Reaper, which is what was used for the songs).
If it's taken from online somewhere and it doesn't work there's probably a converter somewhere you can look up.