package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: ajek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajek {
    /* renamed from: a */
    private static byyp m58596a(aiye aiye) {
        if (aiye == null) {
            return null;
        }
        bxvf bxvf = (bxvf) byyp.f168984e.mo74144da();
        bxvf bxvf2 = (bxvf) byyq.f168991c.mo74144da();
        if (bxvf2.f164950c) {
            bxvf2.mo74035c();
            bxvf2.f164950c = false;
        }
        byyq byyq = (byyq) bxvf2.f164949b;
        byyq.f168994b = 1;
        byyq.f168993a |= 1;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byyp byyp = (byyp) bxvf.f164949b;
        byyq byyq2 = (byyq) bxvf2.mo74062i();
        byyq2.getClass();
        byyp.f168988c = byyq2;
        byyp.f168986a |= 2;
        int i = aiye.f70055c.f80692e;
        if (i == Integer.MAX_VALUE || i > 86400) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajek", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("ProtoConverter: Publish with unexpectedly long TTL(%d seconds). Using default TTL(%d seconds).", i, 300);
            i = 300;
        }
        long b = ajdq.m58561b(i);
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byyp byyp2 = (byyp) bxvf.f164949b;
        byyp2.f168986a = 1 | byyp2.f168986a;
        byyp2.f168987b = b;
        byyy a = m58597a(aiye.f70055c.f80693f);
        if (a != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            byyp byyp3 = (byyp) bxvf.f164949b;
            a.getClass();
            byyp3.f168989d = a;
            byyp3.f168986a |= 8;
        }
        return (byyp) bxvf.mo74062i();
    }

    /* renamed from: a */
    public static byyy m58597a(int i) {
        if (i != 1) {
            return null;
        }
        bxvd da = byyy.f169040c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byyy byyy = (byyy) da.f164949b;
        byyy.f169043b = 1;
        byyy.f169042a = 1 | byyy.f169042a;
        return (byyy) da.mo74062i();
    }

    /* renamed from: a */
    public static byze m58598a(Message message) {
        if (message == null) {
            return null;
        }
        bxvd da = byze.f169064e.mo74144da();
        byzh a = m58599a(message.f80678d, message.f80677c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byze byze = (byze) da.f164949b;
        a.getClass();
        byze.f169067b = a;
        byze.f169066a |= 1;
        ByteString a2 = ByteString.m123261a(message.f80676b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byze byze2 = (byze) da.f164949b;
        a2.getClass();
        byze2.f169066a |= 2;
        byze2.f169068c = a2;
        return (byze) da.mo74062i();
    }

    /* renamed from: a */
    public static byzh m58599a(String str, String str2) {
        if (str == null && str2 == null) {
            return null;
        }
        bxvd da = byzh.f169078d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byzh byzh = (byzh) da.f164949b;
        str.getClass();
        int i = byzh.f169080a | 1;
        byzh.f169080a = i;
        byzh.f169081b = str;
        str2.getClass();
        byzh.f169080a = i | 2;
        byzh.f169082c = str2;
        return (byzh) da.mo74062i();
    }

    /* renamed from: a */
    public static byzw m58600a(Strategy strategy) {
        if (strategy == null) {
            return null;
        }
        bxvd da = byzw.f169185e.mo74144da();
        int i = strategy.f80696i;
        if (i == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byzw byzw = (byzw) da.f164949b;
            byzw.f169189c = 2;
            byzw.f169187a |= 2;
        } else if (i == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byzw byzw2 = (byzw) da.f164949b;
            byzw2.f169189c = 3;
            byzw2.f169187a |= 2;
        } else if (i != 3) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajek", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to convert illegal DiscoveryMode=%d", strategy.f80696i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byzw byzw3 = (byzw) da.f164949b;
            byzw3.f169189c = 1;
            byzw3.f169187a |= 2;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byzw byzw4 = (byzw) da.f164949b;
            byzw4.f169189c = 1;
            byzw4.f169187a |= 2;
        }
        int i2 = strategy.f80695h;
        if (i2 == -1) {
            byzw byzw5 = (byzw) da.f164949b;
            byzw5.f169190d = 1;
            byzw5.f169187a |= 8;
        } else if (i2 == 2) {
            byzw byzw6 = (byzw) da.f164949b;
            byzw6.f169190d = 2;
            byzw6.f169187a |= 8;
        } else if (i2 != 4) {
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68432a("ajek", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("Failed to convert illegal DiscoveryMedium=%d", strategy.f80695h);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byzw byzw7 = (byzw) da.f164949b;
            byzw7.f169190d = 1;
            byzw7.f169187a |= 8;
        } else {
            byzw byzw8 = (byzw) da.f164949b;
            byzw8.f169190d = 4;
            byzw8.f169187a |= 8;
        }
        return (byzw) da.mo74062i();
    }

    /* renamed from: a */
    public static Message m58601a(byze byze) {
        return m58602a(byze, (NearbyDevice[]) null);
    }

    /* renamed from: a */
    public static Message m58602a(byze byze, NearbyDevice[] nearbyDeviceArr) {
        long j;
        byte[] k = byze.f169068c.getKey();
        byzh byzh = byze.f169067b;
        if (byzh == null) {
            byzh = byzh.f169078d;
        }
        String str = byzh.f169081b;
        byzh byzh2 = byze.f169067b;
        if (byzh2 == null) {
            byzh2 = byzh.f169078d;
        }
        String str2 = byzh2.f169082c;
        if ((byze.f169066a & 4) != 0) {
            j = byze.f169069d;
        } else {
            j = 0;
        }
        return new Message(k, str, str2, nearbyDeviceArr, j);
    }
}
