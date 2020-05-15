package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.UUID;

/* renamed from: jxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jxx extends jwz {

    /* renamed from: a */
    private static final imr f23492a = imr.m15727a("ControlledActivity.controller");

    /* renamed from: b */
    private static final imr f23493b = imr.m15727a("ControlledActivity.id");

    /* renamed from: c */
    private static final imr f23494c = imr.m15727a("ControlledActivity.indirection_key");

    /* renamed from: n */
    public static final imr f23495n = imr.m15727a("ControlledActivity.session_id");

    /* renamed from: o */
    public static final imr f23496o = imr.m15727a("ControlledActivity.session_index");

    /* renamed from: d */
    private Controller f23497d;

    /* renamed from: e */
    private int f23498e;

    /* renamed from: a */
    public static Intent m17489a(Intent intent, Controller controller, int i) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        ims ims = new ims();
        ims.mo13148b(f23492a, controller);
        ims.mo13148b(f23493b, Integer.valueOf(i));
        Bundle bundle = ims.f21367a;
        bundle.putAll(extras);
        ims ims2 = new ims();
        ims2.mo13148b(f23494c, bundle);
        if (srk.m36121a(cbxo.f178521a.mo6606a().mo75582a())) {
            intent.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        return intent.addFlags(33554432).putExtras(ims2.f21367a);
    }

    /* renamed from: c */
    private final long mo7860c() {
        return ((boco) this.f23434l.f23510b.f164949b).f132586d;
    }

    /* renamed from: k */
    public static boolean m17492k() {
        return qkd.f41591a >= 107;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo14204h() {
        super.mo14204h();
        if (this.f23497d != null) {
            bodh bodh = mo14205i().f132624o;
            if (bodh == null) {
                bodh = bodh.f132682k;
            }
            bxvd bxvd = (bxvd) bodh.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bodh);
            botr botr = ((bodh) bxvd.f164949b).f132691h;
            if (botr == null) {
                botr = botr.f134863f;
            }
            bxvd bxvd2 = (bxvd) botr.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) botr);
            long c = mo7860c();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            botr botr2 = (botr) bxvd2.f164949b;
            botr2.f134865a |= 16;
            botr2.f134869e = c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bodh bodh2 = (bodh) bxvd.f164949b;
            botr botr3 = (botr) bxvd2.mo74062i();
            botr3.getClass();
            bodh2.f132691h = botr3;
            bodh2.f132684a |= 64;
            bxvd j = mo14206j();
            bodh bodh3 = (bodh) bxvd.mo74062i();
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct = (boct) j.f164949b;
            boct boct2 = boct.f132600I;
            bodh3.getClass();
            boct.f132624o = bodh3;
            boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23497d = (Controller) mo14202g().mo13146a(f23492a);
        this.f23498e = ((Integer) mo14202g().mo13147a(f23493b, 0)).intValue();
        if (this.f23497d != null) {
            if (!mo14202g().mo13149b(f23495n)) {
                mo14202g().mo13148b(f23495n, UUID.randomUUID().toString());
            }
            if (!mo14202g().mo13149b(f23496o)) {
                mo14202g().mo13148b(f23496o, 0);
            }
            bxvd da = bodh.f132682k.mo74144da();
            bxvd da2 = botr.f134863f.mo74144da();
            if ((mo14205i().f132610a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                bodh bodh = mo14205i().f132624o;
                if (bodh == null) {
                    bodh = bodh.f132682k;
                }
                bxvd bxvd = (bxvd) bodh.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bodh);
                if ((bodh.f132684a & 64) != 0) {
                    botr botr = bodh.f132691h;
                    if (botr == null) {
                        botr = botr.f134863f;
                    }
                    da2 = (bxvd) botr.mo74142c(5);
                    da2.mo73625a((GeneratedMessageLite) botr);
                    da = bxvd;
                } else {
                    da = bxvd;
                }
            }
            int intValue = ((Integer) mo14202g().mo13147a(f23496o, 0)).intValue();
            String b = this.f23497d.mo7863b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodh bodh2 = (bodh) da.f164949b;
            b.getClass();
            bodh2.f132684a |= 4;
            bodh2.f132687d = b;
            String str = (String) mo14202g().mo13146a(f23495n);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodh bodh3 = (bodh) da.f164949b;
            str.getClass();
            int i = bodh3.f132684a | 1;
            bodh3.f132684a = i;
            bodh3.f132685b = str;
            int i2 = i | 2;
            bodh3.f132684a = i2;
            bodh3.f132686c = intValue;
            int i3 = this.f23498e;
            bodh3.f132684a = i2 | 8;
            bodh3.f132688e = i3;
            String b2 = this.f23497d.mo7863b();
            int i4 = this.f23498e;
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 11);
            sb.append(b2);
            sb.append(i4);
            String sb2 = sb.toString();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            botr botr2 = (botr) da2.f164949b;
            sb2.getClass();
            botr2.f134865a |= 4;
            botr2.f134867c = sb2;
            long c = mo7860c();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            botr botr3 = (botr) da2.f164949b;
            int i5 = botr3.f134865a | 16;
            botr3.f134865a = i5;
            botr3.f134869e = c;
            botr3.f134865a = i5 | 2;
            botr3.f134866b = (long) intValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bodh bodh4 = (bodh) da.f164949b;
            botr botr4 = (botr) da2.mo74062i();
            botr4.getClass();
            bodh4.f132691h = botr4;
            bodh4.f132684a |= 64;
            bxvd j = mo14206j();
            bodh bodh5 = (bodh) da.mo74062i();
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct = (boct) j.f164949b;
            boct boct2 = boct.f132600I;
            bodh5.getClass();
            boct.f132624o = bodh5;
            boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        }
    }

    /* renamed from: a */
    public static void m17490a(Activity activity, Controller controller, jxw jxw) {
        int i;
        if (jxw.mo14213a()) {
            bizc.m103024a(activity.getIntent(), jxw.f23487b);
            activity.startActivity(m17489a(jxw.f23487b, controller, jxw.f23486a));
        } else {
            activity.setResult(jxw.f23488c, jxw.f23489d);
        }
        activity.finish();
        int i2 = jxw.f23490e;
        if (i2 != -1 && (i = jxw.f23491f) != -1) {
            activity.overridePendingTransition(i2, i);
        }
    }

    /* renamed from: a */
    public void mo7874a(int i, Intent intent) {
        int i2;
        FeatureRequestExtras.ResultReader fromIntent;
        if (this.f23497d != null) {
            if (!m17492k() || (fromIntent = FeatureRequestExtras.ResultReader.fromIntent(intent)) == null || i != 0) {
                i2 = i;
            } else {
                i2 = fromIntent.getDownloadResultCode();
            }
            this.f23434l.mo14218a(i2);
            jxw a = this.f23497d.mo7862a(new jxy(this.f23498e, i, intent));
            if (a.mo14213a()) {
                Intent intent2 = a.f23487b;
                ims ims = new ims();
                ims.mo13148b(f23495n, (String) mo14202g().mo13146a(f23495n));
                ims.mo13148b(f23496o, Integer.valueOf(((Integer) mo14202g().mo13147a(f23496o, 0)).intValue() + 1));
                intent2.putExtras(ims.f21367a);
            }
            m17490a(this, this.f23497d, a);
            bodh bodh = mo14205i().f132624o;
            if (bodh == null) {
                bodh = bodh.f132682k;
            }
            bxvd bxvd = (bxvd) bodh.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bodh);
            if (a.mo14213a()) {
                int i3 = a.f23486a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bodh bodh2 = (bodh) bxvd.f164949b;
                bodh2.f132684a |= 16;
                bodh2.f132689f = i3;
                botr botr = bodh2.f132691h;
                if (botr == null) {
                    botr = botr.f134863f;
                }
                bxvd bxvd2 = (bxvd) botr.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) botr);
                String b = this.f23497d.mo7863b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 11);
                sb.append(b);
                sb.append(i3);
                String sb2 = sb.toString();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                botr botr2 = (botr) bxvd2.f164949b;
                sb2.getClass();
                botr2.f134865a |= 8;
                botr2.f134868d = sb2;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bodh bodh3 = (bodh) bxvd.f164949b;
                botr botr3 = (botr) bxvd2.mo74062i();
                botr3.getClass();
                bodh3.f132691h = botr3;
                bodh3.f132684a |= 64;
            } else {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bodh bodh4 = (bodh) bxvd.f164949b;
                int i4 = bodh4.f132684a | 128;
                bodh4.f132684a = i4;
                bodh4.f132692i = true;
                int i5 = a.f23488c;
                bodh4.f132684a = i4 | 32;
                bodh4.f132690g = i5;
            }
            bxvd j = mo14206j();
            bodh bodh5 = (bodh) bxvd.mo74062i();
            if (j.f164950c) {
                j.mo74035c();
                j.f164950c = false;
            }
            boct boct = (boct) j.f164949b;
            boct boct2 = boct.f132600I;
            bodh5.getClass();
            boct.f132624o = bodh5;
            boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            return;
        }
        super.mo7874a(i, intent);
    }
}
