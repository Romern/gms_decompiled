package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentSection;

/* renamed from: ftr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftr {
    /* renamed from: a */
    public static cixm m12360a(Bundle bundle) {
        cixl cixl = (cixl) cixm.f191686d.mo74144da();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                bxvd da = cixn.f191691g.mo74144da();
                String str2 = (String) obj;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cixn cixn = (cixn) da.f164949b;
                str2.getClass();
                cixn.f191693a |= 2;
                cixn.f191695c = str2;
                cixn cixn2 = (cixn) da.mo74062i();
                bxvd da2 = cixk.f191681d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cixk cixk = (cixk) da2.f164949b;
                str.getClass();
                int i = cixk.f191683a | 1;
                cixk.f191683a = i;
                cixk.f191684b = str;
                cixn2.getClass();
                cixk.f191685c = cixn2;
                cixk.f191683a = i | 2;
                cixl.mo86632a((cixk) da2.mo74062i());
            } else if (obj instanceof Bundle) {
                bxvd da3 = cixn.f191691g.mo74144da();
                cixm a = m12360a((Bundle) obj);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cixn cixn3 = (cixn) da3.f164949b;
                a.getClass();
                cixn3.f191698f = a;
                cixn3.f191693a |= 16;
                cixn cixn4 = (cixn) da3.mo74062i();
                bxvd da4 = cixk.f191681d.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                cixk cixk2 = (cixk) da4.f164949b;
                str.getClass();
                int i2 = cixk2.f191683a | 1;
                cixk2.f191683a = i2;
                cixk2.f191684b = str;
                cixn4.getClass();
                cixk2.f191685c = cixn4;
                cixk2.f191683a = i2 | 2;
                cixl.mo86632a((cixk) da4.mo74062i());
            } else if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                for (String str3 : strArr) {
                    if (str3 != null) {
                        bxvd da5 = cixn.f191691g.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        cixn cixn5 = (cixn) da5.f164949b;
                        str3.getClass();
                        cixn5.f191693a |= 2;
                        cixn5.f191695c = str3;
                        cixn cixn6 = (cixn) da5.mo74062i();
                        bxvd da6 = cixk.f191681d.mo74144da();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        cixk cixk3 = (cixk) da6.f164949b;
                        str.getClass();
                        int i3 = cixk3.f191683a | 1;
                        cixk3.f191683a = i3;
                        cixk3.f191684b = str;
                        cixn6.getClass();
                        cixk3.f191685c = cixn6;
                        cixk3.f191683a = i3 | 2;
                        cixl.mo86632a((cixk) da6.mo74062i());
                    }
                }
            } else if (obj instanceof Bundle[]) {
                Bundle[] bundleArr = (Bundle[]) obj;
                for (Bundle bundle2 : bundleArr) {
                    if (bundle2 != null) {
                        bxvd da7 = cixn.f191691g.mo74144da();
                        cixm a2 = m12360a(bundle2);
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        cixn cixn7 = (cixn) da7.f164949b;
                        a2.getClass();
                        cixn7.f191698f = a2;
                        cixn7.f191693a |= 16;
                        cixn cixn8 = (cixn) da7.mo74062i();
                        bxvd da8 = cixk.f191681d.mo74144da();
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        cixk cixk4 = (cixk) da8.f164949b;
                        str.getClass();
                        int i4 = cixk4.f191683a | 1;
                        cixk4.f191683a = i4;
                        cixk4.f191684b = str;
                        cixn8.getClass();
                        cixk4.f191685c = cixn8;
                        cixk4.f191683a = i4 | 2;
                        cixl.mo86632a((cixk) da8.mo74062i());
                    }
                }
            } else if (obj instanceof Boolean) {
                bxvd da9 = cixn.f191691g.mo74144da();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                cixn cixn9 = (cixn) da9.f164949b;
                cixn9.f191693a |= 1;
                cixn9.f191694b = booleanValue;
                cixn cixn10 = (cixn) da9.mo74062i();
                bxvd da10 = cixk.f191681d.mo74144da();
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                cixk cixk5 = (cixk) da10.f164949b;
                str.getClass();
                int i5 = cixk5.f191683a | 1;
                cixk5.f191683a = i5;
                cixk5.f191684b = str;
                cixn10.getClass();
                cixk5.f191685c = cixn10;
                cixk5.f191683a = i5 | 2;
                cixl.mo86632a((cixk) da10.mo74062i());
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Unsupported value: ");
                sb.append(valueOf);
                Log.e("SearchIndex", sb.toString());
            }
        }
        if (bundle.containsKey("type")) {
            String string = bundle.getString("type");
            if (cixl.f164950c) {
                cixl.mo74035c();
                cixl.f164950c = false;
            }
            cixm cixm = (cixm) cixl.f164949b;
            string.getClass();
            cixm.f191688a |= 1;
            cixm.f191689b = string;
        }
        return (cixm) cixl.mo74062i();
    }

    /* renamed from: a */
    public static DocumentSection m12361a(String str, cixm cixm) {
        fsa fsa = new fsa(str);
        fsa.f17179b = true;
        fsa.f17183f = str;
        fsa.f17178a = "blob";
        return new DocumentSection(cixm.mo73642k(), fsa.mo11234a());
    }
}
