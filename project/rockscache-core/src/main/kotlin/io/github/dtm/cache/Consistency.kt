package io.github.dtm.cache

/**
 * @author 陈涛
 */
enum class Consistency {
    EVENTUAL,
    STRONG,
    ALLOW_BUSY_EXCEPTION
}