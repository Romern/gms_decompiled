package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: ayai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayai implements axzy, ayjh {

    /* renamed from: a */
    public static ayai f96907a;

    /* renamed from: i */
    private static final bnic f96908i = bnic.m109491a("com.google.android.wearable.datatransfer.OPEN_CONNECTION", "com.google.android.wearable.datatransfer.DATA_TRANSFER", "com.google.android.wearable.datatransfer.DATA_TRANSFER_ACK");

    /* renamed from: b */
    public ayak f96909b;

    /* renamed from: c */
    public volatile axzm f96910c;

    /* renamed from: d */
    public final Object f96911d = new Object();

    /* renamed from: e */
    public SharedPreferences f96912e;

    /* renamed from: f */
    public final HashMap f96913f = new HashMap();

    /* renamed from: g */
    public ayaf f96914g;

    /* renamed from: h */
    public aygw f96915h;

    /* renamed from: j */
    private final ayjs f96916j;

    /* renamed from: k */
    private final HashMap f96917k = new HashMap();

    public ayai(ayjs ayjs) {
        this.f96916j = ayjs;
    }

    /* renamed from: a */
    private static final int m83684a(int i, int i2) {
        return ((i + 527) * 31) + i2;
    }

    /* renamed from: a */
    public static SharedPreferences m83685a(Context context) {
        return context.getSharedPreferences("wearable.rpc_service.settings", 0);
    }

    /* renamed from: a */
    public final int mo53831a(axue axue, String str, boolean z, String str2, byte[] bArr, ayen ayen) {
        String str3;
        int i;
        int i2;
        boolean z2;
        String str4;
        int i3;
        axue axue2 = axue;
        String str5 = str;
        String str6 = str2;
        byte[] bArr2 = bArr;
        ayen ayen2 = ayen;
        if ("cloud".equals(str5)) {
            return 1;
        }
        axzm axzm = this.f96910c;
        if (axzm != null && f96908i.contains(str6) && axzm.mo53789c(str5)) {
            if (Log.isLoggable("rpcs", 3)) {
                Log.d("rpcs", "Data transfer packet dropped, because connection is metered");
            }
            this.f96909b.f96928i.mo24359a();
            return -1;
        }
        String a = mo53832a(axue2.f96377a, str5, str6);
        synchronized (this.f96917k) {
            if (!z) {
                try {
                    str3 = String.valueOf(a).concat(" nopreserve");
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                str3 = a;
            }
            ayag ayag = (ayag) this.f96917k.get(str3);
            if (ayag == null) {
                if (z) {
                    i3 = this.f96912e.getInt(a, 1) + 1;
                    this.f96912e.edit().putInt(a, i3).apply();
                } else {
                    i3 = 0;
                }
                ayag ayag2 = new ayag(i3);
                this.f96917k.put(str3, ayag2);
                ayag = ayag2;
            }
            i = ayag.f96898a;
            i2 = ayag.f96899b + 1;
            ayag.f96899b = i2;
        }
        if (Log.isLoggable("rpcs", 2)) {
            if (ayen2 != null) {
                Log.v("rpcs", String.format("sendMessage: (%11s:%d:%d), %s, channel request", a, Integer.valueOf(i), Integer.valueOf(i2), axue2.f96377a));
            } else {
                if (bArr2 != null) {
                    str4 = String.valueOf(bArr2.length);
                } else {
                    str4 = "null";
                }
                Log.v("rpcs", String.format("sendMessage: (%11s:%d:%d), %s, size %s, %s", a, Integer.valueOf(i), Integer.valueOf(i2), axue2.f96377a, str4, str6));
            }
        }
        ayak ayak = this.f96909b;
        bxvd da = ayfa.f97427k.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa.m83902a((ayfa) da.f164949b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa = (ayfa) da.f164949b;
        "".getClass();
        int i4 = ayfa.f97429a | 32;
        ayfa.f97429a = i4;
        ayfa.f97434f = "";
        int i5 = i4 | 512;
        ayfa.f97429a = i5;
        ayfa.f97438j = i;
        ayfa.f97429a = i5 | 1;
        ayfa.f97430b = i2;
        String str7 = axue2.f96377a;
        sdo.m34959a((Object) str7);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa2 = (ayfa) da.f164949b;
        str7.getClass();
        ayfa2.f97429a |= 2;
        ayfa2.f97431c = str7;
        String str8 = axue2.f96379c;
        sdo.m34959a((Object) str8);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa3 = (ayfa) da.f164949b;
        str8.getClass();
        ayfa3.f97429a |= 4;
        ayfa3.f97432d = str8;
        sdo.m34959a((Object) str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa4 = (ayfa) da.f164949b;
        str.getClass();
        ayfa4.f97429a |= 8;
        ayfa4.f97433e = str5;
        String str9 = ayak.f96930k.mo53808b().f96814a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa5 = (ayfa) da.f164949b;
        str9.getClass();
        ayfa5.f97429a |= 128;
        ayfa5.f97436h = str9;
        if (bArr2 == null) {
            z2 = true;
        } else {
            z2 = ayen2 == null;
        }
        sdo.m34975b(z2, "can't set data and channel");
        if (ayen2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayfa ayfa6 = (ayfa) da.f164949b;
            ayen.getClass();
            ayfa6.f97437i = ayen2;
            ayfa6.f97429a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (bArr2 != null) {
            ByteString a2 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayfa ayfa7 = (ayfa) da.f164949b;
            a2.getClass();
            ayfa7.f97429a |= 64;
            ayfa7.f97435g = a2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa8 = (ayfa) da.f164949b;
        str2.getClass();
        ayfa8.f97429a |= 32;
        ayfa8.f97434f = str6;
        ayfa ayfa9 = (ayfa) da.mo74062i();
        if (Log.isLoggable("rpctransport", 2)) {
            String valueOf = String.valueOf(ayak.m83690a(ayfa9));
            Log.v("rpctransport", valueOf.length() == 0 ? new String("sendRpc: ") : "sendRpc: ".concat(valueOf));
        }
        ayak.f96923d.mo54040a("send", String.format(Locale.US, " [%3d:%3d] %s %-31s %s %s", Integer.valueOf(ayfa9.f97438j), Integer.valueOf(ayfa9.f97430b), ayfa9.f97433e, ayfa9.f97431c, ayfa9.f97434f, ayjs.m84121a(ayfa9)));
        if (ayak.mo53835a((String) null, ayfa9)) {
            ayak.f96927h.mo24359a();
            return m83684a(i, i2);
        }
        ayak.f96928i.mo24359a();
        return -1;
    }

    /* renamed from: a */
    public final String mo53832a(String str, String str2, String str3) {
        String str4 = !ayak.m83692a(str, str3) ? "lo" : "hi";
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str4.length());
        sb.append(str2);
        sb.append(":");
        sb.append(str4);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo53580a() {
        this.f96912e.edit().clear().commit();
        synchronized (this.f96917k) {
            this.f96917k.clear();
        }
        synchronized (this.f96913f) {
            this.f96913f.clear();
        }
    }

    /* renamed from: a */
    public final void mo53833a(int i, int i2, axue axue, String str, byte[] bArr, String str2, ayen ayen) {
        String str3;
        axue axue2 = axue;
        String str4 = str;
        byte[] bArr2 = bArr;
        String str5 = str2;
        ayen ayen2 = ayen;
        int i3 = 0;
        if (Log.isLoggable("rpcs", 2)) {
            String a = mo53832a(axue2.f96377a, "local", str4);
            if (ayen2 != null) {
                Log.d("rpcs", String.format("deliverMessage: (%11s:%d:%d), %s, channel request", a, Integer.valueOf(i), Integer.valueOf(i2), axue2.f96377a));
            } else {
                if (bArr2 != null) {
                    str3 = String.valueOf(bArr2.length);
                } else {
                    str3 = "null";
                }
                Log.d("rpcs", String.format("deliverMessage: (%11s:%d:%d), %s, size %s, %s", a, Integer.valueOf(i), Integer.valueOf(i2), axue2.f96377a, str3, str4));
            }
        }
        if (ayen2 != null) {
            this.f96916j.mo54040a("receive", String.format(Locale.US, " [%3d:%3d] %s %-31s %s %s", Integer.valueOf(i), Integer.valueOf(i2), str5, axue2.f96377a, str4, ayjs.m84120a(ayen)));
            ayaf ayaf = this.f96914g;
            if (ayaf != null) {
                if (Log.isLoggable("ChannelManager", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("received ChannelRequest from ");
                    sb.append(str5);
                    sb.append(":");
                    StringBuilder sb2 = new StringBuilder("\n  ");
                    int length = sb2.length();
                    sb.append((CharSequence) sb2);
                    sb.append("minimum_version: ");
                    sb.append(ayen2.f97334b);
                    sb.append((CharSequence) sb2);
                    sb.append("origin: ");
                    sb.append(ayen2.f97335c);
                    if ((ayen2.f97333a & 4) != 0) {
                        sb.append((CharSequence) sb2);
                        sb.append("control {");
                        sb2.append("  ");
                        ayei ayei = ayen2.f97336d;
                        if (ayei == null) {
                            ayei = ayei.f97299j;
                        }
                        sb.append((CharSequence) sb2);
                        sb.append("type: ");
                        int a2 = ayeh.m83883a(ayei.f97302b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (a2 == 1) {
                            sb.append("CHANNEL_CONTROL_OPEN");
                        } else if (a2 != 2) {
                            sb.append("CHANNEL_CONTROL_CLOSE");
                        } else {
                            sb.append("CHANNEL_CONTROL_OPEN_ACK");
                        }
                        sb.append((CharSequence) sb2);
                        sb.append("channel_id: ");
                        sb.append(ayei.f97303c);
                        sb.append((CharSequence) sb2);
                        sb.append("from_channel_opener: ");
                        sb.append(ayei.f97304d);
                        axvu.m83330a(sb, sb2, "package_name", ayei.f97305e);
                        axvu.m83330a(sb, sb2, "signature_digest", ayei.f97306f);
                        axvu.m83330a(sb, sb2, "path", ayei.f97307g);
                        sb.append((CharSequence) sb2);
                        sb.append("close_error_code: ");
                        sb.append(ayei.f97308h);
                        sb.append((CharSequence) sb2);
                        sb.append("allow_over_metered: ");
                        sb.append(ayei.f97309i);
                        sb2.setLength(length);
                        sb.append((CharSequence) sb2);
                        sb.append("}");
                    }
                    if ((ayen2.f97333a & 8) != 0) {
                        sb.append((CharSequence) sb2);
                        sb.append("data {");
                        sb2.append("  ");
                        ayel ayel = ayen2.f97337e;
                        if (ayel == null) {
                            ayel = ayel.f97321e;
                        }
                        if ((ayel.f97323a & 1) != 0) {
                            int length2 = sb2.length();
                            sb.append((CharSequence) sb2);
                            sb.append("header {");
                            sb2.append("  ");
                            ayek ayek = ayel.f97324b;
                            if (ayek == null) {
                                ayek = ayek.f97315e;
                            }
                            axvu.m83329a(ayek, sb, sb2);
                            sb2.setLength(length2);
                            sb.append((CharSequence) sb2);
                            sb.append("}");
                        }
                        sb.append((CharSequence) sb2);
                        sb.append("payload: <size: ");
                        sb.append(ayel.f97325c.mo73744a());
                        sb.append(">");
                        sb.append((CharSequence) sb2);
                        sb.append("final_message: ");
                        sb.append(ayel.f97326d);
                        sb2.setLength(length);
                        sb.append((CharSequence) sb2);
                        sb.append("}");
                    }
                    if ((ayen2.f97333a & 16) != 0) {
                        sb.append((CharSequence) sb2);
                        sb.append("data_ack {");
                        sb2.append("  ");
                        ayej ayej = ayen2.f97338f;
                        if (ayej == null) {
                            ayej = ayej.f97310d;
                        }
                        int length3 = sb2.length();
                        if ((ayej.f97312a & 1) != 0) {
                            sb.append("header {");
                            sb2.append("  ");
                            ayek ayek2 = ayej.f97313b;
                            if (ayek2 == null) {
                                ayek2 = ayek.f97315e;
                            }
                            axvu.m83329a(ayek2, sb, sb2);
                            sb2.setLength(length3);
                            sb.append((CharSequence) sb2);
                            sb.append("}");
                        }
                        sb.append((CharSequence) sb2);
                        sb.append("final_message: ");
                        sb.append(ayej.f97314c);
                        sb2.setLength(length);
                        sb.append((CharSequence) sb2);
                        sb.append("}");
                    }
                    Log.v("ChannelManager", sb.toString());
                }
                int i4 = ayen2.f97334b;
                if (i4 > 1) {
                    StringBuilder sb3 = new StringBuilder(61);
                    sb3.append("Dropping ChannelRequest with unsupported version: ");
                    sb3.append(i4);
                    Log.w("ChannelManager", sb3.toString());
                    return;
                }
                ayem a3 = ayem.m83888a(ayen2.f97335c);
                if (a3 == null) {
                    int i5 = ayen2.f97335c;
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("Dropping ChannelRequest with unknown origin: ");
                    sb4.append(i5);
                    Log.w("ChannelManager", sb4.toString());
                    return;
                }
                int i6 = ayen2.f97333a;
                if ((i6 & 4) != 0) {
                    ayei ayei2 = ayen2.f97336d;
                    if (ayei2 == null) {
                        ayei2 = ayei.f97299j;
                    }
                    int a4 = ayeh.m83883a(ayei2.f97302b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    if (a4 == 1) {
                        if (Log.isLoggable("ChannelManager", 2)) {
                            Log.v("ChannelManager", String.format("Posting onChannelOpenRequest(%s, request)", str5));
                        }
                        axvr axvr = (axvr) ayaf;
                        axvr.mo53625a(new axvg(axvr, str5, ayei2, a3));
                    } else if (a4 != 2) {
                        if (Log.isLoggable("ChannelManager", 2)) {
                            Log.v("ChannelManager", String.format("Posting onChannelClose(%s, request)", str5));
                        }
                        axvr axvr2 = (axvr) ayaf;
                        axvr2.mo53625a(new axuw(axvr2, str5, ayei2));
                    } else {
                        if (Log.isLoggable("ChannelManager", 2)) {
                            String valueOf = String.valueOf(str2);
                            Log.v("ChannelManager", valueOf.length() == 0 ? new String("Posting onChannelOpenAck: ") : "Posting onChannelOpenAck: ".concat(valueOf));
                        }
                        axvr axvr3 = (axvr) ayaf;
                        axvr3.mo53625a(new axvh(axvr3, str5, ayei2));
                    }
                } else if ((i6 & 8) != 0) {
                    ayel ayel2 = ayen2.f97337e;
                    if (ayel2 == null) {
                        ayel2 = ayel.f97321e;
                    }
                    sdo.m34959a((Object) str2);
                    sdo.m34959a(ayel2);
                    if ((ayel2.f97323a & 1) == 0) {
                        Log.w("ChannelManager", "Received ChannelDataRequest with no header");
                    }
                    if (Log.isLoggable("ChannelManager", 2)) {
                        Log.v("ChannelManager", String.format("Posting onChannelDataRequest(%s, request)", str5));
                    }
                    axvr axvr4 = (axvr) ayaf;
                    axvr4.mo53625a(new axux(axvr4, str5, ayel2));
                } else if ((i6 & 16) != 0) {
                    ayej ayej2 = ayen2.f97338f;
                    if (ayej2 == null) {
                        ayej2 = ayej.f97310d;
                    }
                    sdo.m34959a((Object) str2);
                    sdo.m34959a(ayej2);
                    if ((ayej2.f97312a & 1) == 0) {
                        Log.w("ChannelManager", "Received ChannelDataAckRequest with no header");
                    }
                    if (Log.isLoggable("ChannelManager", 2)) {
                        Log.v("ChannelManager", String.format("Posting onChannelDataAckRequest(%s, request)", str5));
                    }
                    axvr axvr5 = (axvr) ayaf;
                    axvr5.mo53625a(new axuy(axvr5, str5, ayej2));
                }
            }
        } else {
            axty.m83205b(6, axue2.f96377a);
            ayjs ayjs = this.f96916j;
            String str6 = axue2.f96377a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = str5;
            objArr[3] = str6;
            objArr[4] = str4;
            if (bArr2 != null) {
                i3 = bArr2.length;
            }
            objArr[5] = Integer.valueOf(i3);
            ayjs.mo54040a("receive", String.format(locale, " [%3d:%3d] %s %-31s %s %s", objArr));
            synchronized (this.f96911d) {
                aygw aygw = this.f96915h;
                if (aygw != null) {
                    int a5 = m83684a(i, i2);
                    axue a6 = aygw.f97554a.f111030x.mo53995a(axue2, str4);
                    if (Log.isLoggable("WearableService", 2)) {
                        String valueOf2 = String.valueOf(a6);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                        sb5.append("onMessageReceived: ");
                        sb5.append(valueOf2);
                        sb5.append(" ");
                        sb5.append(a5);
                        Log.v("WearableService", sb5.toString());
                    }
                    aygw.f97554a.mo60325a(a6, new aygv("onMessageReceived", new Intent("com.google.android.gms.wearable.MESSAGE_RECEIVED", ayao.m83709a(str5, str4)).setPackage(a6.f96378b), new MessageEventParcelable(a5, str4, bArr2, str5), bArr, str2));
                }
            }
        }
    }
}
