# Image-Difference-Finder
A program to find the differences in "spot the differences" pictures

![Alt text](https://raw.githubusercontent.com/Frichetten/Image-Difference-Finder/master/Image1.jpg)

   How many differences did you spot? 3? 4? Let me help you with that.

![Alt text](https://raw.githubusercontent.com/Frichetten/Image-Difference-Finder/master/Image1-output-modified.jpg)

   If you found those 8, good job. The purpose of this program is to find all the differences in a "spot the differences"
   picture. It's a short java program that will take in a jpg image, and spit out an image that will show the differences
   between the two panels. 
   
   To get it to work properly, you do have to tweak the code a little. This is because we can't know how thick the border
   between the two images is. You can also tweak the color of the "white out" effect so that the changes are shown more 
   clearly.
   
   I cant take all the credit for this. I had to do some research on how to get the RGB values of specific pixel in a
   jpg image. Alvin Alexander had a great example on his blog, which I used and it is highly effective. For more visit...
   
   http://alvinalexander.com/blog/post/java/getting-rgb-values-for-each-pixel-in-image-using-java-bufferedi
   
   The program works by taking in a jpg. Then, it will go pixel by pixel, comparing the two images. Because not every
   pixel is the same, there is a particular range of RGB values it will accept as different. It will then "white out"
   the pixels that it believes are the same, revealing the differences. The program will then spit out another image
   that will highlight the differences. The image above is a modified version of an image made by the program, the
   red circles were drawn by me to show the specific changes.
   
   The program isn't entirely perfect and should be used more as a "find the general area of a difference" however it does
   work well enough to find all the changes. There are a couple examples in this repository.
   
   What started out as my first program working with images was a success. I have to say, nothing was more satisfying 
   than seeing that the program found changes that even I didn't see after staring at the picture for 10 minutes.
   -Nicholas Frichette 8/27/2015
