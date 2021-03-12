/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

class Puppy(
    val image: String,
    val name: String,
    val age: Int,
    val sex: String,
    val description: String
)

val puppies = listOf(
    Puppy("🐕", "Amigo", 1, "female", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce sit amet elementum enim, vitae consectetur dui. Praesent pulvinar, nisi quis finibus gravida, urna nisl blandit urna, at bibendum elit dui quis diam. Cras tempus tincidunt hendrerit. Etiam euismod ante in nibh fermentum semper. Mauris in eros vehicula, accumsan tellus nec, porta risus. Donec sagittis pharetra sapien, in ultrices leo fringilla et. Maecenas sit amet metus condimentum, egestas augue vel, molestie lacus."),
    Puppy("🐶", "Buddy", 5, "male", "Nulla eget elit sed nunc suscipit vestibulum in ut mi. Curabitur ac nibh eget dui auctor vulputate. Nulla facilisi. Praesent sit amet ante dolor. Maecenas facilisis ultricies odio, in blandit purus rhoncus nec. Sed dictum metus sit amet neque gravida, eget maximus neque ornare. Integer sit amet quam suscipit, convallis nisi in, blandit mi. Aenean pretium felis ut semper rutrum. Ut nec ligula vitae sapien semper ultricies vitae nec est. Suspendisse at dictum turpis, vel volutpat neque. Fusce sit amet enim pulvinar, vestibulum elit in, accumsan turpis. Praesent consectetur, magna ac ultrices eleifend, sapien neque egestas est, et tincidunt nibh nibh non ipsum. Nulla suscipit leo diam, sit amet rhoncus elit pulvinar sit amet."),
    Puppy("\uD83D\uDC15\u200D\uD83E\uDDBA", "Mark", 7, "male", "Pellentesque molestie pharetra bibendum. Integer malesuada gravida nibh eget suscipit. Proin et nibh et elit imperdiet eleifend in sit amet tellus. Pellentesque imperdiet, ante non consectetur lacinia, nibh lorem ultricies ligula, sed efficitur leo augue id est. Sed hendrerit, lacus sit amet suscipit sodales, elit lacus laoreet ante, sed faucibus justo nulla suscipit ligula. Praesent condimentum egestas efficitur. Curabitur gravida vitae orci vitae aliquet. Ut lorem nunc, consequat venenatis hendrerit ut, sagittis at arcu. Morbi a sapien est. Fusce pretium ut quam dapibus euismod. Aliquam tincidunt risus vitae tellus auctor vulputate. Sed et semper nulla. Nunc lorem purus, gravida nec tortor eu, commodo dapibus quam."),
    Puppy("\uD83E\uDDAE", "Mikel", 20, "male", "Morbi laoreet orci nec ante placerat congue. Etiam interdum eget ligula eget interdum. Nam venenatis in lorem ut fringilla. Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque nulla mauris, ultrices nec nisl non, dapibus iaculis nulla. Quisque scelerisque lorem est, vel auctor sapien placerat a. Morbi nec quam vel mauris lacinia sagittis quis et libero. Integer tristique eros elit, nec bibendum ex tincidunt ut. Nam enim lorem, sagittis cursus vehicula ac, consectetur eget justo. Integer sollicitudin, leo sed vestibulum vestibulum, tellus risus venenatis mauris, vitae convallis ligula mauris in neque. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;"),
    Puppy("🐩", "Smith", 10, "female", "Etiam a mauris eros. Pellentesque feugiat tellus risus, a vestibulum felis porta ultrices. Nam euismod nisl et ligula pharetra vulputate. Mauris luctus arcu quis lacinia hendrerit. Nam ornare euismod orci, sodales mollis ligula efficitur eget. Ut scelerisque maximus hendrerit. Morbi ac elit condimentum, egestas ipsum quis, porttitor nunc. Aliquam vehicula neque a purus placerat aliquam. Duis egestas velit in metus tincidunt, aliquet varius quam aliquam."),
)
