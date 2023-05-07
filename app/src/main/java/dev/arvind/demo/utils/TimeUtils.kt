package dev.arvind.demo.utils

import java.util.Calendar

/** Returns [Boolean] based on current time.
 * Returns true if hours between 06:00 PM - 07:00 AM**/
fun isNight() : Boolean {
    val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    return (currentHour <= 7 || currentHour >= 18)
}