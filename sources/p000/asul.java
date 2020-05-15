package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: asul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asul extends asum {

    /* renamed from: a */
    public static volatile boolean f89755a = false;

    /* renamed from: b */
    private static final srn f89756b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    private static final SparseArray f89757c;

    static {
        SparseArray sparseArray = new SparseArray();
        f89757c = sparseArray;
        sparseArray.put(90, asuh.f89751a);
        f89757c.put(86, asui.f89752a);
        f89757c.put(87, asuj.f89753a);
        f89757c.put(40811, asuk.f89754a);
    }

    /* renamed from: a */
    public static void m74850a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.google.commerce.tapandpay.alienfood", 1);
            f89755a = true;
        } catch (PackageManager.NameNotFoundException e) {
            f89755a = false;
        }
    }

    /* renamed from: a */
    private static byte[] m74851a(astf astf) {
        if (astf.mo49461a() == null || astf.mo49461a().length <= 0) {
            return astf.mo49462b();
        }
        try {
            assu a = assu.m74713a(astf.mo49461a());
            return astf.m74756a(a.mo49446a(f89757c, a).mo49449d(), astf.f89655a).mo49462b();
        } catch (assv e) {
            bnsl a2 = f89756b.mo26019b(aske.m74275a());
            a2.mo68437a(e);
            a2.mo68432a("asul", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68405a("Tlv conversion error");
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m74852a(byte[] bArr) {
        String a = asti.m74760a(bArr);
        int indexOf = a.toLowerCase(Locale.ENGLISH).indexOf(100);
        if (indexOf <= 0) {
            return new byte[bArr.length];
        }
        return bqce.m112562a(new byte[(indexOf >> 1)], asti.m74762a(a.substring(indexOf)));
    }

    /* renamed from: a */
    public final void mo49486a(Context context, asqw asqw, int i) {
        byte[] bArr;
        if (asqw.f89440d != null && f89755a && asqw.f89450n != -1) {
            bxvd da = btoq.f149787g.mo74144da();
            String str = asqw.f89437a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((btoq) da.f164949b).f149789a = str;
            bxvd da2 = btoo.f149781b.mo74144da();
            int hashCode = asqw.f89437a.hashCode();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btoo btoo = (btoo) da2.f164949b;
            if (!btoo.f149783a.mo73666a()) {
                btoo.f149783a = GeneratedMessageLite.m124019a(btoo.f149783a);
            }
            btoo.f149783a.mo74153d(hashCode);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btoo btoo2 = (btoo) da2.mo74062i();
            btoo2.getClass();
            ((btoq) da.f164949b).f149793e = btoo2;
            bxvd da3 = bton.f149778b.mo74144da();
            int i2 = asqw.f89431H;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bton bton = (bton) da3.f164949b;
            if (i2 != 1) {
                bton.f149780a = i2 - 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bton bton2 = (bton) da3.mo74062i();
                bton2.getClass();
                ((btoq) da.f164949b).f149792d = bton2;
                ArrayList arrayList = new ArrayList();
                List list = asqw.f89438b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    asqt asqt = (asqt) list.get(i3);
                    arrayList.add(ByteString.m123261a(asqt.f89400a));
                    astf astf = asqt.f89401b;
                    if (astf.mo49461a() == null || astf.mo49461a().length <= 0) {
                        bArr = astf.mo49462b();
                    } else {
                        try {
                            assu a = assu.m74713a(astf.mo49461a());
                            bArr = astf.m74756a(a.mo49446a(f89757c, a).mo49449d(), astf.f89655a).mo49462b();
                        } catch (assv e) {
                            bnsl a2 = f89756b.mo26019b(aske.m74275a());
                            a2.mo68437a(e);
                            a2.mo68432a("asul", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a2.mo68405a("Tlv conversion error");
                            bArr = null;
                        }
                    }
                    if (bArr != null) {
                        arrayList.add(ByteString.m123261a(bArr));
                    }
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btoq btoq = (btoq) da.f164949b;
                if (!btoq.f149794f.mo73666a()) {
                    btoq.f149794f = GeneratedMessageLite.m124021a(btoq.f149794f);
                }
                bxsy.m123078a(arrayList, btoq.f149794f);
                bxvd da4 = btop.f149784b.mo74144da();
                int myUid = Process.myUid();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((btop) da4.f164949b).f149786a = myUid;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btop btop = (btop) da4.mo74062i();
                btop.getClass();
                ((btoq) da.f164949b).f149790b = btop;
                long b = asqw.mo49397b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btoq) da.f164949b).f149791c = b;
                Intent putExtra = new Intent("com.google.android.gms.tapandpay.COLLECT_FIELD_TEST_INFO").putExtra("account_id_extra", asqw.f89440d).putExtra("field_test_auto_info_extra", ((btoq) da.mo74062i()).serializeToBytes());
                atxn.m76508c(context, putExtra);
                atxn.m76509d(context, putExtra);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }
}
