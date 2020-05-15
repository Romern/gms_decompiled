package com.google.android.gms.org.conscrypt;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class PeerInfoProvider {
    private static final PeerInfoProvider NULL_PEER_INFO_PROVIDER = new PeerInfoProvider() {
        /* class com.google.android.gms.org.conscrypt.PeerInfoProvider.C16531 */

        public String getHostname() {
            return null;
        }

        public String getHostnameOrIP() {
            return null;
        }

        public int getPort() {
            return -1;
        }
    };

    static PeerInfoProvider forHostAndPort(final String str, final int i) {
        return new PeerInfoProvider() {
            /* class com.google.android.gms.org.conscrypt.PeerInfoProvider.C16542 */

            public String getHostname() {
                return str;
            }

            public String getHostnameOrIP() {
                return str;
            }

            public int getPort() {
                return i;
            }
        };
    }

    static PeerInfoProvider nullProvider() {
        return NULL_PEER_INFO_PROVIDER;
    }

    public abstract String getHostname();

    public abstract String getHostnameOrIP();

    public abstract int getPort();
}
