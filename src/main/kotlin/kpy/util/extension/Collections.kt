package kpy.util.extension

import java.util.*
import kotlin.collections.ArrayDeque

/*
* Collection builders & extension methods
*
* @author jakode
* @since v1.0.0 07/12/2021
*/

/**
 * Return a linked list from elements
 * @see LinkedList
 */
fun <T> linkedListOf(vararg elements: T): LinkedList<T> =
    if (elements.isNotEmpty()) LinkedList(elements.toList()) else LinkedList()

/**
 * Return a empty linked list
 * @see LinkedList
 */
fun <T> linkedListOf(): LinkedList<T> = LinkedList()

/**
 * Return a vector from elements
 * @see Vector
 */
fun <T> vectorOf(vararg elements: T): Vector<T> = if (elements.isNotEmpty()) Vector(elements.toList()) else Vector()

/**
 * Return a empty vector
 * @see Vector
 * @param size default size is 10
 * @param incrementStep default step to increment size is zero
 */
fun <T> vectorOf(size: Int = 10, incrementStep: Int = 0): Vector<T> = Vector(size, incrementStep)

/**
 * Return a stack from elements
 * @see Stack
 */
fun <T> stackOf(vararg elements: T): Stack<T> =
    if (elements.isNotEmpty()) Stack<T>().also { it.addAll(elements.toList()) } else Stack()

/**
 * Return a empty stack
 * @see Stack
 */
fun <T> stackOf(): Stack<T> = Stack()

/**
 * Return a queue from elements
 * @see Queue
 */
fun <T> queueOf(vararg elements: T): Queue<T> =
    if (elements.isNotEmpty()) LinkedList(elements.toList()) else LinkedList()

/**
 * Return a empty queue
 * @see Queue
 */
fun <T> queueOf(): Queue<T> = LinkedList()

/**
 * Return a priority queue from elements
 * @see PriorityQueue
 */
fun <T> priorityQueueOf(vararg elements: T): PriorityQueue<T> =
    if (elements.isNotEmpty()) PriorityQueue(elements.toList()) else PriorityQueue()

/**
 * Return a empty priority queue
 * @see PriorityQueue
 * @param comparator initiate queue order
 */
fun <T> priorityQueueOf(comparator: Comparator<T>? = null): PriorityQueue<T> =
    comparator?.let { PriorityQueue(comparator) } ?: PriorityQueue()

/**
 * Return a doubly queue from elements
 * @see Deque
 */
fun <T> dequeOf(vararg elements: T): Deque<T> =
    if (elements.isNotEmpty()) LinkedList(elements.toList()) else LinkedList()

/**
 * Return a empty doubly queue
 * @see Deque
 */
fun <T> dequeOf(): Deque<T> = LinkedList()

/**
 * Return a array queue from elements
 * @see ArrayDeque
 */
fun <T> arrayDequeOf(vararg elements: T): ArrayDeque<T> =
    if (elements.isNotEmpty()) ArrayDeque(elements.toList()) else ArrayDeque()

/**
 * Return a empty array queue
 * @see ArrayDeque
 */
fun <T> arrayDequeOf(): ArrayDeque<T> = ArrayDeque()

/**
 * Return a hash table from elements
 * @see Hashtable
 */
fun <T, K> hashTableOf(vararg elements: Pair<T, K>): Hashtable<T, K> =
    if (elements.isNotEmpty()) Hashtable(elements.toMap()) else Hashtable()

/**
 * Return a empty hash table
 * @see Hashtable
 */
fun <T, K> hashTableOf(): Hashtable<T, K> = Hashtable()

/**
 * Return head of the iterable
 * @param n number of elements return
 * @return sublist
 */
fun <T> Iterable<T>.head(n: Int = 10): List<T> = this.take(n)

/**
 * Return head of the array
 * @param n number of elements return
 * @return sublist
 */
fun <T> Array<out T>.head(n: Int = 10): List<T> = this.take(n)

/**
 * Return tail of the iterable
 * @param n number of elements return
 * @return sublist
 */
fun <T> Iterable<T>.tail(n: Int = 10): List<T> {
    val length = this.count() - n
    return this.drop(if (length < 0) 0 else length)
}

/**
 * Return tail of the array
 * @param n number of elements return
 * @return sublist
 */
fun <T> Array<out T>.tail(n: Int = 10): List<T> {
    val length = this.size - n
    return this.drop(if (length < 0) 0 else length)
}