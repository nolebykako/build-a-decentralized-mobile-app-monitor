data class AppData(
    val appId: String,
    val appName: String,
    val appCategory: String,
    val version: String,
    val developer: String,
    val rating: Double,
    val reviews: Int,
    val downloads: Int,
    val lastUpdated: Long
)

data class MonitorData(
    val nodeId: String,
    val nodeName: String,
    val nodeType: String, // e.g. "mobile", "desktop"
    val appData: List<AppData>,
    val timestamp: Long
)

data class Node(
    val nodeId: String,
    val nodeName: String,
    val nodeType: String,
    val connectedNodes: List<String>,
    val appData: List<AppData>
)

data class Blockchain(
    val blockNumber: Int,
    val transactions: List<MonitorData>,
    val previousBlockHash: String,
    val hash: String
)

data class DecentralizedMonitor(
    val nodes: List<Node>,
    val blockchain: List<Blockchain>
)