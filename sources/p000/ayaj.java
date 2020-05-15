package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ayaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayaj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f96918a;

    /* renamed from: b */
    final /* synthetic */ ayak f96919b;

    public ayaj(ayak ayak, Bundle bundle) {
        this.f96919b = ayak;
        this.f96918a = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0328  */
    public final void run() {
        ayak ayak;
        axya axya;
        ayfa ayfa;
        boolean z;
        String str;
        Bundle bundle;
        byte[] bArr;
        ayak ayak2 = this.f96919b;
        Bundle bundle2 = this.f96918a;
        axya axya2 = new axya(ayak.m83691a(bundle2.getString("path"), "1".equals(bundle2.getString("isChannel")), bundle2.getString("pkgName")));
        ayak2.f96922c.mo53756a(axya2, "chunksRecv", 1);
        ayam ayam = ayak2.f96921b;
        boolean containsKey = bundle2.containsKey("cw_hash");
        if (containsKey) {
            int parseInt = Integer.parseInt(bundle2.getString("cw_hash"));
            ayal ayal = ayam.f96936a;
            int parseInt2 = Integer.parseInt(bundle2.getString("cw_split"));
            int parseInt3 = Integer.parseInt(bundle2.getString("cw_numSplits"));
            int parseInt4 = Integer.parseInt(bundle2.getString("cw_hash"));
            axya = axya2;
            int parseInt5 = Integer.parseInt(bundle2.getString("cw_maxSplitLen"));
            ayak = ayak2;
            int parseInt6 = Integer.parseInt(bundle2.getString("cw_totalSize"));
            str = "cw_hash";
            C1231nx nxVar = ayal.f96935a;
            z = containsKey;
            Integer valueOf = Integer.valueOf(parseInt4);
            byte[][] bArr2 = (byte[][]) nxVar.mo15546a(valueOf);
            if (bArr2 == null) {
                bArr2 = new byte[parseInt3][];
                ayal.f96935a.mo15547a(valueOf, bArr2);
            }
            bArr2[parseInt2] = bundle2.getByteArray("rawData");
            int length = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < length) {
                    int i3 = length;
                    byte[] bArr3 = bArr2[i];
                    if (bArr3 == null) {
                        bArr = null;
                        break;
                    }
                    i2 += bArr3.length;
                    i++;
                    length = i3;
                } else if (i2 == parseInt6) {
                    bArr = new byte[i2];
                    int i4 = 0;
                    while (i4 < bArr2.length) {
                        byte[] bArr4 = bArr2[i4];
                        System.arraycopy(bArr4, 0, bArr, parseInt5 * i4, bArr4.length);
                        i4++;
                        parseInt5 = parseInt5;
                        bArr2 = bArr2;
                    }
                } else {
                    bArr = null;
                }
            }
            if (bArr != null) {
                ayal.f96935a.mo15552b(Integer.valueOf(parseInt4));
                bundle2.putByteArray("rawData", bArr);
                bundle = bundle2;
            } else {
                bundle = null;
            }
            if (bundle == null) {
                if (Log.isLoggable("rpctransport", 2)) {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("don't have all the splits for hash ");
                    sb.append(parseInt);
                    Log.v("rpctransport", sb.toString());
                    ayfa = null;
                } else {
                    ayfa = null;
                }
                if (ayfa == null) {
                    ayak ayak3 = ayak;
                    ayak3.f96922c.mo53756a(axya, "msgsRecv", 1);
                    ayak3.f96922c.mo53756a(axya, "bytesRecv", ayfa.f97435g.mo73744a());
                    if (!ayha.m83998d().mo53566e()) {
                        if (Log.isLoggable("rpctransport", 2)) {
                            String valueOf2 = String.valueOf(bundle2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
                            sb2.append("Cloud sync isn't started yet. Ignore cloud rpc: ");
                            sb2.append(valueOf2);
                            Log.v("rpctransport", sb2.toString());
                        }
                        ayak3.f96926g.mo24359a();
                        ayak3.f96923d.mo54039a(axwp.f96618a.f96814a, ayfa, "not connected to cloud");
                        return;
                    }
                    if (Log.isLoggable("rpctransport", 2)) {
                        bundle2.size();
                        String valueOf3 = String.valueOf(bundle2);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                        sb3.append("handleCloudRpc: ");
                        sb3.append(valueOf3);
                        Log.v("rpctransport", sb3.toString());
                    }
                    String string = bundle2.getString("networkId");
                    String c = ayak3.f96920a.mo53805c();
                    if (c == null) {
                        Log.d("rpctransport", "handleCloudRpc: error, the cloud network isn't configured");
                        ayak3.f96926g.mo24359a();
                        ayak3.f96923d.mo54039a(axwp.f96618a.f96814a, ayfa, "cloud network not configured");
                        return;
                    } else if (!c.equals(string)) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 73 + c.length());
                        sb4.append("handleCloudRpc: error, the networkId (");
                        sb4.append(string);
                        sb4.append(" != the configured cloud network (");
                        sb4.append(c);
                        sb4.append(")");
                        Log.d("rpctransport", sb4.toString());
                        ayak3.f96926g.mo24359a();
                        ayjs ayjs = ayak3.f96923d;
                        String str2 = axwp.f96618a.f96814a;
                        StringBuilder sb5 = new StringBuilder(c.length() + 45 + String.valueOf(string).length());
                        sb5.append("the networkIds doesn't match, expected ");
                        sb5.append(c);
                        sb5.append(", was ");
                        sb5.append(string);
                        ayjs.mo54039a(str2, ayfa, sb5.toString());
                        return;
                    } else {
                        if (Log.isLoggable("rpctransport", 2)) {
                            String valueOf4 = String.valueOf(ayak.m83690a(ayfa));
                            Log.v("rpctransport", valueOf4.length() == 0 ? new String("handleCloudRpc: ") : "handleCloudRpc: ".concat(valueOf4));
                        }
                        if (ayak.m83694b(ayfa.f97433e)) {
                            bxvd bxvd = (bxvd) ayfa.mo74142c(5);
                            bxvd.mo73625a((bxvk) ayfa);
                            String str3 = ayak3.f96930k.mo53808b().f96814a;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            ayfa ayfa2 = (ayfa) bxvd.f164949b;
                            ayfa ayfa3 = ayfa.f97427k;
                            str3.getClass();
                            ayfa2.f97429a |= 8;
                            ayfa2.f97433e = str3;
                            ayfa = (ayfa) bxvd.mo74062i();
                        }
                        ayak3.f96923d.mo54038a(axwp.f96618a.f96814a, ayfa);
                        if (ayak3.mo53835a(axwp.f96618a.f96814a, ayfa)) {
                            ayak3.f96925f.mo24359a();
                            return;
                        } else {
                            ayak3.f96926g.mo24359a();
                            return;
                        }
                    }
                } else {
                    ayak.f96926g.mo24359a();
                    ayak.f96923d.mo54040a("INCHUNK", " DROPPED unable to parse");
                    return;
                }
            } else if (Log.isLoggable("rpctransport", 2)) {
                String string2 = bundle.getString("cw_numSplits");
                StringBuilder sb6 = new StringBuilder(String.valueOf(string2).length() + 38);
                sb6.append("found all ");
                sb6.append(string2);
                sb6.append(" splits for hash ");
                sb6.append(parseInt);
                Log.v("rpctransport", sb6.toString());
            }
        } else {
            ayak = ayak2;
            axya = axya2;
            str = "cw_hash";
            z = containsKey;
            bundle = bundle2;
        }
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
        ayfa ayfa4 = (ayfa) da.f164949b;
        "".getClass();
        ayfa4.f97429a |= 32;
        ayfa4.f97434f = "";
        String string3 = bundle.getString("sourceNodeId");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa5 = (ayfa) da.f164949b;
        string3.getClass();
        ayfa5.f97429a |= 128;
        ayfa5.f97436h = string3;
        String string4 = bundle.getString("pkgName");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa6 = (ayfa) da.f164949b;
        string4.getClass();
        ayfa6.f97429a |= 2;
        ayfa6.f97431c = string4;
        String string5 = bundle.getString("pkgCert");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa7 = (ayfa) da.f164949b;
        string5.getClass();
        ayfa7.f97429a |= 4;
        ayfa7.f97432d = string5;
        int parseInt7 = Integer.parseInt(bundle.getString("requestId"));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa8 = (ayfa) da.f164949b;
        ayfa8.f97429a |= 1;
        ayfa8.f97430b = parseInt7;
        String string6 = bundle.getString("targetNodeId");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayfa ayfa9 = (ayfa) da.f164949b;
        string6.getClass();
        ayfa9.f97429a |= 8;
        ayfa9.f97433e = string6;
        if (bundle.getString("generation") != null) {
            int parseInt8 = Integer.parseInt(bundle.getString("generation"));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayfa ayfa10 = (ayfa) da.f164949b;
            ayfa10.f97429a |= 512;
            ayfa10.f97438j = parseInt8;
        }
        if ("1".equals(bundle.getString("isChannel"))) {
            byte[] byteArray = bundle.getByteArray("rawData");
            if (byteArray == null) {
                Log.w("rpctransport", "Received invalid null channelRequest bytes.");
                ayfa = null;
            } else {
                bxvd da2 = ayen.f97331g.mo74144da();
                try {
                    da2.mo73635b(byteArray, bxus.m123744c());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ayfa ayfa11 = (ayfa) da.f164949b;
                    ayen ayen = (ayen) da2.mo74062i();
                    ayen.getClass();
                    ayfa11.f97437i = ayen;
                    ayfa11.f97429a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } catch (bxwf e) {
                    String valueOf5 = String.valueOf(e.getMessage());
                    Log.w("rpctransport", valueOf5.length() == 0 ? new String("Received invalid channelRequest bytes: ") : "Received invalid channelRequest bytes: ".concat(valueOf5));
                    ayfa = null;
                }
            }
            if (ayfa == null) {
            }
        } else {
            String string7 = bundle.getString("path");
            if (string7 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayfa ayfa12 = (ayfa) da.f164949b;
                string7.getClass();
                ayfa12.f97429a |= 32;
                ayfa12.f97434f = string7;
            }
            byte[] byteArray2 = bundle.getByteArray("rawData");
            if (byteArray2 != null) {
                bxtx a = bxtx.m123261a(byteArray2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayfa ayfa13 = (ayfa) da.f164949b;
                a.getClass();
                ayfa13.f97429a |= 64;
                ayfa13.f97435g = a;
            }
        }
        ayfa ayfa14 = (ayfa) da.mo74062i();
        if (!z || Integer.parseInt(bundle.getString(str)) == ayam.m83699a(ayfa14, ayam.m83700a(ayfa14))) {
            ayfa = ayfa14;
            if (ayfa == null) {
            }
        } else {
            String valueOf6 = String.valueOf(ayak.m83690a(ayfa14));
            Log.w("rpctransport", valueOf6.length() == 0 ? new String("rpcRequestFromGcmBundle: hash mismatch, dropping") : "rpcRequestFromGcmBundle: hash mismatch, dropping".concat(valueOf6));
            ayfa = null;
            if (ayfa == null) {
            }
        }
    }
}
