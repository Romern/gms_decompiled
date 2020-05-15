package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ayey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayey {
    /* renamed from: a */
    public static ayex m83900a(ayev ayev) {
        int i = ayev.f97378a;
        if ((i & 1) != 0) {
            return ayex.SET_ASSET;
        }
        if ((i & 2) != 0) {
            return ayex.ACK_ASSET;
        }
        if ((i & 4) != 0) {
            return ayex.FETCH_ASSET;
        }
        if ((i & 8) != 0) {
            return ayex.CONNECT;
        }
        if ((i & 16) != 0) {
            return ayex.CRYPTO;
        }
        if ((i & 32) != 0) {
            return ayex.SYNC_START;
        }
        if ((i & 64) != 0) {
            return ayex.SET_DATA_ITEM;
        }
        if ((i & 128) != 0) {
            return ayex.RPC_REQUEST;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            return ayex.CHANNEL_RPC_REQUEST;
        }
        if ((i & 1024) != 0) {
            return ayex.FILE_PIECE;
        }
        if ((i & 512) != 0) {
            return ayex.HEARTBEAT;
        }
        return ayex.UNKNOWN;
    }
}
