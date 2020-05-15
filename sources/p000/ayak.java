package p000;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ayak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayak implements axyu {

    /* renamed from: a */
    public final axzq f96920a;

    /* renamed from: b */
    public final ayam f96921b;

    /* renamed from: c */
    public final axyb f96922c;

    /* renamed from: d */
    public final ayjs f96923d;

    /* renamed from: e */
    public volatile ayai f96924e;

    /* renamed from: f */
    final qxh f96925f;

    /* renamed from: g */
    final qxh f96926g;

    /* renamed from: h */
    final qxh f96927h;

    /* renamed from: i */
    final qxh f96928i;

    /* renamed from: j */
    final qxh f96929j;

    /* renamed from: k */
    public final axzt f96930k;

    /* renamed from: l */
    public final adzt f96931l;

    /* renamed from: m */
    private final Map f96932m = new ConcurrentHashMap();

    /* renamed from: n */
    private final ayae f96933n;

    /* renamed from: o */
    private final aakz f96934o;

    public ayak(axzt axzt, aakz aakz, ayae ayae, axzq axzq, axyb axyb, ayjs ayjs) {
        this.f96934o = aakz;
        this.f96922c = axyb;
        this.f96923d = ayjs;
        sdo.m34959a(axzt);
        this.f96930k = axzt;
        sdo.m34959a(ayae);
        this.f96933n = ayae;
        sdo.m34959a(axzq);
        this.f96920a = axzq;
        this.f96921b = new ayam();
        HandlerThread handlerThread = new HandlerThread("RpcTransportHandler", 9);
        handlerThread.start();
        this.f96931l = new adzt(handlerThread.getLooper());
        axty axty = axty.f96348a;
        this.f96925f = axty.mo53544a("rpcservice-inbound-received");
        this.f96926g = axty.mo53544a("rpcservice-inbound-dropped");
        this.f96927h = axty.mo53544a("rpcservice-outbound-sent");
        this.f96928i = axty.mo53544a("rpcservice-outbound-dropped");
        this.f96929j = axty.mo53544a("rpcservice-proxy-dropped");
    }

    /* renamed from: a */
    static String m83690a(ayfa ayfa) {
        ayen ayen;
        String str;
        String str2 = ayfa.f97436h;
        String str3 = ayfa.f97433e;
        int i = ayfa.f97438j;
        int i2 = ayfa.f97430b;
        String str4 = ayfa.f97431c;
        ByteString bxtx = ayfa.f97435g;
        String str5 = ayfa.f97434f;
        if ((ayfa.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            ayen = ayfa.f97437i;
            if (ayen == null) {
                ayen = ayen.f97331g;
            }
        } else {
            ayen = null;
        }
        if (ayen == null) {
            str = String.format(Locale.US, "%s, dataBytes %d", str5, Integer.valueOf(bxtx.mo73744a()));
        } else {
            str = "is a channel";
        }
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 47 + length2 + String.valueOf(str4).length() + String.valueOf(str).length());
        sb.append("source ");
        sb.append(str2);
        sb.append(", target ");
        sb.append(str3);
        sb.append(", (");
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        sb.append("), ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    private final void m83693b(String str, ayfa ayfa) {
        bxvd bxvd;
        if (Log.isLoggable("rpctransport", 2)) {
            String valueOf = String.valueOf(m83690a(ayfa));
            Log.v("rpctransport", valueOf.length() == 0 ? new String("onRpcRequestFromMessageProto: ") : "onRpcRequestFromMessageProto: ".concat(valueOf));
        }
        if (ayfa.f97436h.isEmpty()) {
            bxvd = (bxvd) ayfa.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) ayfa);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ayfa ayfa2 = (ayfa) bxvd.f164949b;
            ayfa ayfa3 = ayfa.f97427k;
            str.getClass();
            ayfa2.f97429a |= 128;
            ayfa2.f97436h = str;
        } else {
            bxvd = null;
        }
        if (m83694b(ayfa.f97433e)) {
            if (bxvd == null) {
                bxvd = (bxvd) ayfa.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) ayfa);
            }
            String str2 = this.f96930k.mo53808b().f96814a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ayfa ayfa4 = (ayfa) bxvd.f164949b;
            ayfa ayfa5 = ayfa.f97427k;
            str2.getClass();
            ayfa4.f97429a |= 8;
            ayfa4.f97433e = str2;
        }
        if (bxvd != null) {
            ayfa = (ayfa) bxvd.mo74062i();
            if (Log.isLoggable("rpctransport", 2)) {
                String valueOf2 = String.valueOf(m83690a(ayfa));
                Log.v("rpctransport", valueOf2.length() == 0 ? new String("onRpcRequestFromMessageProto, updated request: ") : "onRpcRequestFromMessageProto, updated request: ".concat(valueOf2));
            }
        }
        this.f96923d.mo54038a(str, ayfa);
        if (mo53835a(str, ayfa)) {
            this.f96925f.mo24359a();
        } else {
            this.f96926g.mo24359a();
        }
    }

    /* renamed from: a */
    public static final String m83691a(String str, boolean z, String str2) {
        if (z) {
            String valueOf = String.valueOf(str2);
            return valueOf.length() == 0 ? new String("channel:") : "channel:".concat(valueOf);
        } else if ("com.google.android.gms".equals(str2) || "com.google.android.wearable.app".equals(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "(no path)";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 5 + String.valueOf(str).length());
            sb.append("rpc:");
            sb.append(str2);
            sb.append(":");
            sb.append(str);
            return sb.toString();
        } else {
            String valueOf2 = String.valueOf(str2);
            return valueOf2.length() == 0 ? new String("rpc:") : "rpc:".concat(valueOf2);
        }
    }

    /* renamed from: a */
    public static boolean m83692a(String str, String str2) {
        return "com.google.android.wearable.app".equals(str) && str2.startsWith("/s3");
    }

    /* renamed from: a */
    public final void mo53588a(axyv axyv) {
        this.f96932m.put(axyv.mo53699a().f96814a, axyv);
    }

    /* renamed from: a */
    public final void mo53589a(String str) {
        this.f96932m.remove(str);
    }

    /* renamed from: a */
    public final void mo53590a(String str, ayev ayev, axyt axyt) {
        if ((ayev.f97378a & 128) != 0) {
            ayfa ayfa = ayev.f97386i;
            if (ayfa == null) {
                ayfa = ayfa.f97427k;
            }
            m83693b(str, ayfa);
        }
        if ((ayev.f97378a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            ayfa ayfa2 = ayev.f97387j;
            if (ayfa2 == null) {
                ayfa2 = ayfa.f97427k;
            }
            m83693b(str, ayfa2);
        }
    }

    /* renamed from: a */
    public final boolean mo53835a(String str, ayfa ayfa) {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int length;
        int i5;
        ayen ayen;
        ayaa ayaa;
        String str2 = str;
        ayfa ayfa2 = ayfa;
        if (this.f96930k.mo53808b().f96814a.equals(ayfa2.f97433e)) {
            ayai ayai = this.f96924e;
            int i6 = ayfa2.f97438j;
            int i7 = ayfa2.f97430b;
            axue a = axue.m83239a(ayfa2.f97431c, ayfa2.f97432d);
            String str3 = ayfa2.f97434f;
            byte[] k = ayfa2.f97435g.getKey();
            String str4 = ayfa2.f97436h;
            if ((ayfa2.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                ayen ayen2 = ayfa2.f97437i;
                ayen = ayen2 == null ? ayen.f97331g : ayen2;
            } else {
                ayen = null;
            }
            if (i6 > 0) {
                String a2 = ayai.mo53832a(a.f96377a, str4, str3);
                synchronized (ayai.f96913f) {
                    ayaa ayaa2 = (ayaa) ayai.f96913f.get(a2);
                    if (ayaa2 == null) {
                        ayaa ayaa3 = new ayaa("rpcs", a2, ayai);
                        ayai.f96913f.put(a2, ayaa3);
                        ayaa = ayaa3;
                    } else {
                        ayaa = ayaa2;
                    }
                }
                ayah ayah = new ayah(a, str3, i6, i7, k, str4, ayen);
                ayaa.mo53816a(ayah, i6, ayah.f96903d, SystemClock.elapsedRealtime());
            } else {
                ayai.mo53833a(i6, i7, a, str3, k, str4, ayen);
            }
            return true;
        }
        int i8 = 3;
        int i9 = 0;
        if (ayfa2.f97433e.equals(str2)) {
            if (Log.isLoggable("rpctransport", 3)) {
                String a3 = m83690a(ayfa);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(a3).length());
                sb.append("sendRpcInternal: dropping since target is the same as the last hop, ");
                sb.append(str2);
                sb.append(", ");
                sb.append(a3);
                Log.d("rpctransport", sb.toString());
            }
            ayjs ayjs = this.f96923d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29);
            sb2.append("last hop (");
            sb2.append(str2);
            sb2.append(") is same as target");
            ayjs.mo54042b("unknown", ayfa2, sb2.toString());
            return false;
        }
        axzf b = this.f96933n.mo53828b(ayfa2.f97433e);
        if (b != null) {
            if (Log.isLoggable("rpctransport", 3)) {
                String valueOf = String.valueOf(b);
                String a4 = m83690a(ayfa);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(a4).length());
                sb3.append("sendRpcInternal: found route, ");
                sb3.append(valueOf);
                sb3.append(", ");
                sb3.append(a4);
                Log.d("rpctransport", sb3.toString());
            }
            if (b.f96814a.equals(str2)) {
                if (Log.isLoggable("rpctransport", 3)) {
                    String valueOf2 = String.valueOf(b);
                    String a5 = m83690a(ayfa);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 91 + String.valueOf(str).length() + String.valueOf(a5).length());
                    sb4.append("sendRpcInternal: the best route, ");
                    sb4.append(valueOf2);
                    sb4.append(", is the same as the node that sent this to us ");
                    sb4.append(str2);
                    sb4.append(", dropping ");
                    sb4.append(a5);
                    Log.d("rpctransport", sb4.toString());
                }
                ayjs ayjs2 = this.f96923d;
                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 33);
                sb5.append("the best route is the last hop (");
                sb5.append(str2);
                sb5.append(")");
                ayjs2.mo54042b("unknown", ayfa2, sb5.toString());
                return false;
            }
            axyv axyv = (axyv) this.f96932m.get(b.f96814a);
            if (axyv == null) {
                if (Log.isLoggable("rpctransport", 3)) {
                    String valueOf3 = String.valueOf(b);
                    String a6 = m83690a(ayfa);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 54 + String.valueOf(a6).length());
                    sb6.append("sendRpcInternal: rpcWriter for ");
                    sb6.append(valueOf3);
                    sb6.append(" is null, send failed. ");
                    sb6.append(a6);
                    Log.d("rpctransport", sb6.toString());
                }
                axty.m83205b(8, ayfa2.f97431c);
                ayjs ayjs3 = this.f96923d;
                StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 29);
                sb7.append("last hop (");
                sb7.append(str2);
                sb7.append(") is same as target");
                ayjs3.mo54042b("unknown", ayfa2, sb7.toString());
                return false;
            }
            String str5 = b.f96814a;
            if (axyv == axwp.f96619b) {
                if (Log.isLoggable("rpctransport", 3)) {
                    String valueOf4 = String.valueOf(m83690a(ayfa));
                    Log.d("rpctransport", valueOf4.length() == 0 ? new String("sendRpcInternal: sending to cloud, ") : "sendRpcInternal: sending to cloud, ".concat(valueOf4));
                }
                if (!ayha.m83998d().mo53566e()) {
                    if (Log.isLoggable("rpctransport", 3)) {
                        Log.d("rpctransport", "Not connected to cloud. Skip sending rpc to cloud.");
                    }
                    this.f96923d.mo54042b(axwp.f96618a.f96814a, ayfa2, "next hop is the cloud, but not connected");
                    return false;
                } else if (!ayfa2.f97431c.equals("com.google.android.wearable.app") || !ayfa2.f97434f.startsWith("/clockwork_proxy/proxy")) {
                    String c = this.f96920a.mo53805c();
                    if (c == null) {
                        this.f96923d.mo54042b(axwp.f96618a.f96814a, ayfa2, "next hop is the cloud, but not configured");
                        return false;
                    }
                    try {
                        axya axya = new axya(m83691a(ayfa2.f97434f, (ayfa2.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0, ayfa2.f97431c));
                        this.f96922c.mo53756a(axya, "msgsSent", 1);
                        this.f96922c.mo53756a(axya, "bytesSent", ayfa2.f97435g.mo73744a());
                        byte[] a7 = ayam.m83700a(ayfa);
                        int i10 = 16000;
                        if (a7 == null || (length = a7.length) == 0) {
                            i2 = 1;
                        } else {
                            int i11 = length / 16000;
                            if (length % 16000 != 0) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            i2 = i11 + i5;
                        }
                        Bundle[] bundleArr = new Bundle[i2];
                        if (i2 > 1) {
                            i3 = ayam.m83699a(ayfa2, a7);
                        } else {
                            i3 = 0;
                        }
                        if (a7 != null) {
                            i4 = a7.length;
                        } else {
                            i4 = 0;
                        }
                        int i12 = 0;
                        while (i12 < i2) {
                            if (i2 > 1) {
                                int i13 = i12 * 16000;
                                int min = Math.min(i10, a7.length - i13);
                                bArr = new byte[min];
                                System.arraycopy(a7, i13, bArr, i9, min);
                            } else {
                                bArr = a7;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("type", "rpc");
                            bundle.putString("networkId", c);
                            bundle.putString("sourceNodeId", ayfa2.f97436h);
                            bundle.putString("pkgName", ayfa2.f97431c);
                            bundle.putString("pkgCert", ayfa2.f97432d);
                            bundle.putString("requestId", Integer.toString(ayfa2.f97430b));
                            bundle.putString("targetNodeId", ayfa2.f97433e);
                            bundle.putString("generation", Integer.toString(ayfa2.f97438j));
                            if ((ayfa2.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                                bundle.putString("path", ayfa2.f97434f);
                                bundle.putString("isChannel", "0");
                                if (a7 != null) {
                                    bundle.putByteArray("rawData", bArr);
                                }
                            } else {
                                bundle.putString("isChannel", "1");
                                bundle.putByteArray("rawData", bArr);
                            }
                            if (i2 <= 1) {
                                i10 = 16000;
                            } else {
                                if (i12 == 0) {
                                    if (Log.isLoggable("rpctransport", 2)) {
                                        StringBuilder sb8 = new StringBuilder(58);
                                        sb8.append("splitting message hash ");
                                        sb8.append(i3);
                                        sb8.append(" into ");
                                        sb8.append(i2);
                                        sb8.append(" splits");
                                        Log.v("rpctransport", sb8.toString());
                                    }
                                }
                                bundle.putString("cw_split", Integer.toString(i12));
                                bundle.putString("cw_numSplits", Integer.toString(i2));
                                bundle.putString("cw_hash", Integer.toString(i3));
                                i10 = 16000;
                                bundle.putString("cw_maxSplitLen", Integer.toString(16000));
                                bundle.putString("cw_totalSize", Integer.toString(i4));
                            }
                            bundleArr[i12] = bundle;
                            i12++;
                            i8 = 3;
                            i9 = 0;
                        }
                        for (int i14 = 0; i14 < i2; i14++) {
                            Bundle bundle2 = bundleArr[i14];
                            this.f96922c.mo53756a(axya, "chunksSent", 1);
                            this.f96934o.mo16961a(String.valueOf(chnj.m149031g()).concat("@google.com"), Integer.toString(ayfa2.f97430b), 0, bundle2);
                            axty.m83203a(6, ayfa2.f97431c);
                            if (Log.isLoggable("rpctransport", i8)) {
                                String valueOf5 = String.valueOf(bundle2);
                                StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf5).length() + 19);
                                sb9.append("sent RPC to cloud, ");
                                sb9.append(valueOf5);
                                Log.d("rpctransport", sb9.toString());
                            }
                        }
                        this.f96923d.mo54041b(axwp.f96618a.f96814a, ayfa2);
                        return true;
                    } catch (IOException e) {
                        Log.w("rpctransport", "error sending RPC to cloud");
                        ayjs ayjs4 = this.f96923d;
                        String str6 = axwp.f96618a.f96814a;
                        String valueOf6 = String.valueOf(e.getMessage());
                        ayjs4.mo54042b(str6, ayfa2, valueOf6.length() == 0 ? new String("IOException while sending to cloud: ") : "IOException while sending to cloud: ".concat(valueOf6));
                        return false;
                    }
                } else {
                    if (Log.isLoggable("rpctransport", 3)) {
                        Log.d("rpctransport", "Not sending proxy rpc to cloud node.");
                    }
                    this.f96929j.mo24359a();
                    return false;
                }
            } else {
                bxvd da = ayev.f97376n.mo74144da();
                if ((ayfa2.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ayev ayev = (ayev) da.f164949b;
                    ayfa.getClass();
                    ayev.f97387j = ayfa2;
                    ayev.f97378a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ayev ayev2 = (ayev) da.f164949b;
                    ayfa.getClass();
                    ayev2.f97386i = ayfa2;
                    ayev2.f97378a |= 128;
                }
                if (!m83692a(ayfa2.f97431c, ayfa2.f97434f)) {
                    i = 4;
                } else {
                    i = 8;
                }
                try {
                    axyv.mo53700a(i, 0, (ayev) da.mo74062i(), null);
                    this.f96923d.mo54041b(str5, ayfa2);
                    if (!Log.isLoggable("rpctransport", 2)) {
                        return true;
                    }
                    String valueOf7 = String.valueOf(m83690a(ayfa));
                    Log.v("rpctransport", valueOf7.length() == 0 ? new String("writeRpcToWriter: success: ") : "writeRpcToWriter: success: ".concat(valueOf7));
                    return true;
                } catch (IOException e2) {
                    if (Log.isLoggable("rpctransport", 2)) {
                        String valueOf8 = String.valueOf(m83690a(ayfa));
                        Log.v("rpctransport", valueOf8.length() == 0 ? new String("writeRpcToWriter: failed: ") : "writeRpcToWriter: failed: ".concat(valueOf8), e2);
                    }
                    ayjs ayjs5 = this.f96923d;
                    String valueOf9 = String.valueOf(e2.getMessage());
                    ayjs5.mo54042b(str5, ayfa2, valueOf9.length() == 0 ? new String("IOException from MessageWriter: ") : "IOException from MessageWriter: ".concat(valueOf9));
                    if (Log.isLoggable("rpctransport", 2)) {
                        return false;
                    }
                    String valueOf10 = String.valueOf(m83690a(ayfa));
                    Log.v("rpctransport", valueOf10.length() == 0 ? new String("writeRpcToWriter: failed: ") : "writeRpcToWriter: failed: ".concat(valueOf10));
                    return false;
                } catch (InterruptedException e3) {
                    if (Log.isLoggable("rpctransport", 2)) {
                        String valueOf11 = String.valueOf(m83690a(ayfa));
                        Log.v("rpctransport", valueOf11.length() == 0 ? new String("writeRpcToWriter: failed: ") : "writeRpcToWriter: failed: ".concat(valueOf11), e3);
                    }
                    ayjs ayjs6 = this.f96923d;
                    String valueOf12 = String.valueOf(e3.getMessage());
                    ayjs6.mo54042b(str5, ayfa2, valueOf12.length() == 0 ? new String("InterruptedException from MessageWriter: ") : "InterruptedException from MessageWriter: ".concat(valueOf12));
                    Thread.currentThread().interrupt();
                    return true;
                }
            }
        } else {
            if (Log.isLoggable("rpctransport", 3)) {
                String valueOf13 = String.valueOf(m83690a(ayfa));
                Log.d("rpctransport", valueOf13.length() == 0 ? new String("sendRpcInternal: can't find route, ") : "sendRpcInternal: can't find route, ".concat(valueOf13));
            }
            axty.m83205b(7, ayfa2.f97431c);
            this.f96923d.mo54042b("unknown", ayfa2, "no route to target");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m83694b(String str) {
        if (axwp.f96618a.f96814a.equals(str)) {
            return false;
        }
        try {
            UUID.fromString(str);
            return false;
        } catch (IllegalArgumentException e) {
            try {
                Long.parseLong(str, 16);
                return false;
            } catch (NumberFormatException e2) {
                if (!Log.isLoggable("rpctransport", 2)) {
                    return true;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                sb.append("nodeLooksMadeUp: nodeId ");
                sb.append(str);
                sb.append(" doesn't look like a uuid or integer, assuming made up");
                Log.v("rpctransport", sb.toString());
                return true;
            }
        }
    }
}
