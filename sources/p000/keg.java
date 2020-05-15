package p000;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.Collections;

/* renamed from: keg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class keg extends kdn {

    /* renamed from: b */
    private static final bnic f23925b = bnic.m109490a(kpb.OTP_FULL, kpb.OTP_1);

    /* renamed from: c */
    private static final kpb[] f23926c = {kpb.OTP_1, kpb.OTP_2, kpb.OTP_3, kpb.OTP_4, kpb.OTP_5, kpb.OTP_6, kpb.OTP_7, kpb.OTP_8};

    /* renamed from: d */
    private final Context f23927d;

    public keg(Context context) {
        this.f23927d = context;
    }

    /* renamed from: a */
    public final Class mo14410a() {
        return kdk.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14411a(bnht bnht) {
        return null;
    }

    /* renamed from: a */
    public final bnhe mo14409a(kdk kdk, FillForm fillForm) {
        bnhe bnhe;
        kdk kdk2 = kdk;
        FillForm fillForm2 = fillForm;
        bnha bnha = new bnha();
        int i = 1;
        if ((kdk2.f23892a & 1) != 0) {
            boolean a = fillForm2.mo7949a(kpb.OTP_FULL);
            int i2 = C0126R.C0127drawable.product_logo_messages_color_24;
            int i3 = 0;
            if (a) {
                Spanned fromHtml = Html.fromHtml(String.format("<b>%s</b>", kdk2.f23893b), 0);
                String string = this.f23927d.getString(C0126R.string.autofill_sms_subtext);
                bnre i4 = fillForm2.mo7950b(kpb.OTP_FULL).listIterator();
                while (i4.hasNext()) {
                    bnha.mo67695b((FillField) i4.next(), new kqc(kqk.m18332b(kdk2.f23893b), fromHtml, string, kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_messages_color_24, "code"), kqo.f24804a));
                }
            } else if (fillForm2.mo7949a(kpb.OTP_1)) {
                if (cckh.f179230a.mo6606a().mo76178c()) {
                    bnha bnha2 = new bnha();
                    Spanned fromHtml2 = Html.fromHtml(String.format("<b>%s</b>", kdk2.f23893b), 0);
                    String string2 = this.f23927d.getString(C0126R.string.autofill_sms_subtext);
                    char[] charArray = kdk2.f23893b.toCharArray();
                    int i5 = 0;
                    while (true) {
                        kpb[] kpbArr = f23926c;
                        if (i3 >= kpbArr.length || i5 >= charArray.length) {
                            bnha.mo67694a(bnha2.mo67618b());
                        } else {
                            if (fillForm2.mo7949a(kpbArr[i3])) {
                                kcz a2 = kcz.m17657a("com.google.android.gms", i2, "code");
                                bnre i6 = fillForm2.mo7950b(f23926c[i3]).listIterator();
                                while (i6.hasNext()) {
                                    FillField fillField = (FillField) i6.next();
                                    if (i5 >= charArray.length) {
                                        break;
                                    }
                                    int i7 = i5 + 1;
                                    char c = charArray[i5];
                                    StringBuilder sb = new StringBuilder(i);
                                    sb.append(c);
                                    bnha2.mo67695b(fillField, new kqc(kqk.m18332b(sb.toString()), fromHtml2, string2, a2, kqo.f24804a));
                                    i5 = i7;
                                    i = 1;
                                }
                            }
                            i3++;
                            i = 1;
                            i2 = C0126R.C0127drawable.product_logo_messages_color_24;
                        }
                    }
                    bnha.mo67694a(bnha2.mo67618b());
                } else {
                    bnha bnha3 = new bnha();
                    Spanned fromHtml3 = Html.fromHtml(String.format("<b>%s</b>", kdk2.f23893b), 0);
                    String string3 = this.f23927d.getString(C0126R.string.autofill_sms_subtext);
                    char[] charArray2 = kdk2.f23893b.toCharArray();
                    if (charArray2.length <= f23926c.length) {
                        kcz a3 = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_messages_color_24, "code");
                        while (true) {
                            int length = charArray2.length;
                            if (i3 >= length) {
                                while (true) {
                                    kpb[] kpbArr2 = f23926c;
                                    if (length >= kpbArr2.length) {
                                        bnhe = bnha3.mo67618b();
                                        break;
                                    } else if (fillForm2.mo7949a(kpbArr2[length])) {
                                        bnhe = bnoj.f131912b;
                                        break;
                                    } else {
                                        length++;
                                    }
                                }
                            } else {
                                bngx b = fillForm2.mo7950b(f23926c[i3]);
                                if (b.size() != 1) {
                                    bnhe = bnoj.f131912b;
                                    break;
                                }
                                char c2 = charArray2[i3];
                                StringBuilder sb2 = new StringBuilder(1);
                                sb2.append(c2);
                                bnha3.mo67695b((FillField) bnjd.m109587b(b), new kqc(kqk.m18332b(sb2.toString()), fromHtml3, string3, a3, kqo.f24804a));
                                i3++;
                            }
                        }
                    } else {
                        bnhe = bnoj.f131912b;
                    }
                    bnha.mo67694a(bnhe);
                }
            }
        }
        return bnha.mo67618b();
    }

    /* renamed from: a */
    public final boolean mo14412a(bnic bnic) {
        return !Collections.disjoint(bnic, f23925b);
    }
}
