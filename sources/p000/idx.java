package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: idx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idx {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0100  */
    /* renamed from: a */
    public static boct m15307a(String str, int i, Integer num, GoogleSignInOptions googleSignInOptions) {
        char c;
        bxvd da = boff.f132884g.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boff boff = (boff) da.f164949b;
            str.getClass();
            boff.f132886a |= 1;
            boff.f132887b = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boff boff2 = (boff) da.f164949b;
        boff2.f132888c = i - 1;
        boff2.f132886a |= 2;
        int intValue = num.intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boff boff3 = (boff) da.f164949b;
        boff3.f132886a |= 4;
        boff3.f132889d = intValue;
        if (googleSignInOptions != null) {
            bxvd da2 = bofg.f132892j.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bofg bofg = (bofg) da2.f164949b;
            int i2 = bofg.f132894a | 2;
            bofg.f132894a = i2;
            bofg.f132896c = false;
            int i3 = i2 | 4;
            bofg.f132894a = i3;
            bofg.f132897d = false;
            bofg.f132894a = i3 | 1;
            bofg.f132895b = false;
            ArrayList a = googleSignInOptions.mo7526a();
            int size = a.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                String str2 = ((Scope) a.get(i5)).f30106b;
                int hashCode = str2.hashCode();
                if (hashCode != -1010579227) {
                    if (hashCode != -309425751) {
                        if (hashCode == 96619420 && str2.equals("email")) {
                            c = 0;
                            if (c != 0) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bofg bofg2 = (bofg) da2.f164949b;
                                bofg2.f132894a |= 2;
                                bofg2.f132896c = true;
                            } else if (c == 1) {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bofg bofg3 = (bofg) da2.f164949b;
                                bofg3.f132894a |= 4;
                                bofg3.f132897d = true;
                            } else if (c != 2) {
                                i4++;
                            } else {
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bofg bofg4 = (bofg) da2.f164949b;
                                bofg4.f132894a |= 1;
                                bofg4.f132895b = true;
                            }
                        }
                    } else if (str2.equals("profile")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                } else if (str2.equals("openid")) {
                    c = 2;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bofg bofg5 = (bofg) da2.f164949b;
            int i6 = bofg5.f132894a | 8;
            bofg5.f132894a = i6;
            bofg5.f132898e = i4;
            boolean z = googleSignInOptions.f10337j;
            int i7 = i6 | 16;
            bofg5.f132894a = i7;
            bofg5.f132899f = z;
            boolean z2 = googleSignInOptions.f10338k;
            int i8 = i7 | 32;
            bofg5.f132894a = i8;
            bofg5.f132900g = z2;
            boolean z3 = googleSignInOptions.f10339l;
            bofg5.f132894a = i8 | 64;
            bofg5.f132901h = z3;
            ArrayList arrayList = googleSignInOptions.f10342o;
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                int i10 = ((GoogleSignInOptionsExtensionParcelable) arrayList.get(i9)).f10349b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bofg bofg6 = (bofg) da2.f164949b;
                if (!bofg6.f132902i.mo73666a()) {
                    bofg6.f132902i = bxvk.m124019a(bofg6.f132902i);
                }
                bofg6.f132902i.mo74153d(i10);
            }
            bofg bofg7 = (bofg) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boff boff4 = (boff) da.f164949b;
            bofg7.getClass();
            boff4.f132890e = bofg7;
            boff4.f132886a |= 8;
        }
        boff boff5 = (boff) da.f164949b;
        boff5.f132886a |= 16;
        boff5.f132891f = false;
        bxvd da3 = boct.f132600I.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        boct boct = (boct) da3.f164949b;
        boct.f132612c = 16;
        boct.f132610a |= 1;
        boff boff6 = (boff) da.mo74062i();
        boff6.getClass();
        boct.f132627r = boff6;
        boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        return (boct) da3.mo74062i();
    }

    /* renamed from: a */
    public static Set m15308a(Set set) {
        HashSet hashSet = new HashSet(set);
        if (hashSet.remove(aacw.f27968a)) {
            hashSet.add(aacw.f27969b);
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m15309a(GoogleSignInOptions googleSignInOptions) {
        if (!((Boolean) icl.f20740e.mo58455c()).booleanValue() || sqc.m35963b(googleSignInOptions.mo7527b(), new Scope("https://www.googleapis.com/auth/plus.login"))) {
            return false;
        }
        return true;
    }
}
