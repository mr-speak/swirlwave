package com.swirlwave.android.proxies.clientside;

public enum ClientProtocolStateCode {
    UNKNOWN,
    CONNECT_ONION_PROXY,
    WRITE_ONION_PROXY_CONNECTION_REQUEST,
    ONION_PROXY_CONNECTION_REQUEST_REJECTED,
    PROXYING,
    READ_ONION_PROXY_CONNECTION_REQUEST_RESPONSE
}
