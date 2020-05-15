package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: lgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgm implements lgd {

    /* renamed from: a */
    public final Context f26044a;

    public lgm(Context context) {
        this.f26044a = context;
    }

    /* renamed from: a */
    private final bmxv m19034a(FillForm fillForm, bmxv bmxv) {
        PendingIntent pendingIntent;
        if (!ccjy.f179220a.mo6606a().mo76169a()) {
            return bmvz.f131120a;
        }
        bngx b = fillForm.mo7950b(kpb.PAYMENT_CARD_NUMBER);
        if (b.isEmpty()) {
            return bmvz.f131120a;
        }
        Context context = this.f26044a;
        Intent a = lio.m19197a(context, fillForm);
        if (a != null) {
            pendingIntent = lio.m19189a(context, a);
        } else {
            pendingIntent = null;
        }
        if (pendingIntent == null) {
            return bmvz.f131120a;
        }
        Context context2 = this.f26044a;
        CharSequence b2 = lbj.m18891a(context2).mo15386b(C0126R.string.autofill_scan_card);
        RemoteViews a2 = lbj.m18888a(context2, b2, null, kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.quantum_ic_photo_camera_grey600_36, b2), false, 2);
        bmxv a3 = bmxv.mo66810a((bmxj) new lgk(this));
        kby a4 = kbz.m17615a();
        a4.mo14353a(pendingIntent.getIntentSender());
        bnre i = b.listIterator();
        while (i.hasNext()) {
            a4.mo14355a(((FillField) i.next()).f11631a, null, a2, a3);
        }
        kbz a5 = a4.mo14352a();
        return a5 != null ? bmxv.m108566b(new lgb(a5, lbe.SCAN_CARD)) : bmvz.f131120a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ba  */
    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        bmxv bmxv;
        if (lgc.mo15061a().mo66813a()) {
            bngs b = bngx.m109371b(2);
            bmxv a = m19034a(lgc.f26027c, lgc.mo15061a());
            if (a.mo66813a()) {
                b.mo67668c((lgb) a.mo66814b());
            }
            FillForm fillForm = lgc.f26027c;
            bmxv a2 = lgc.mo15061a();
            if (a2.mo66813a()) {
                bngx b2 = fillForm.mo7950b(kpb.PAYMENT_CARD_NUMBER);
                if (!b2.isEmpty()) {
                    Context context = this.f26044a;
                    CharSequence b3 = lbj.m18891a(context).mo15386b(C0126R.string.autofill_manage_payment_methods);
                    RemoteViews a3 = lbj.m18888a(context, b3, null, kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.wallet_card_general, b3), false, 2);
                    bmxv a4 = a2.mo66810a((bmxj) new lgl(this));
                    kby a5 = kbz.m17615a();
                    PendingIntent a6 = lio.m19189a(this.f26044a, lio.m19200c(9).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", lqx.m19547a(fillForm)));
                    if (a6 != null) {
                        a5.mo14353a(a6.getIntentSender());
                    }
                    bnre i = b2.listIterator();
                    while (i.hasNext()) {
                        a5.mo14355a(((FillField) i.next()).f11631a, null, a3, a4);
                    }
                    kbz a7 = a5.mo14352a();
                    if (a7 != null) {
                        bmxv = bmxv.m108566b(new lgb(a7, lbe.KEYBOARD_PAYMENT_CARD_PICKER));
                        if (bmxv.mo66813a()) {
                            b.mo67668c((lgb) bmxv.mo66814b());
                        }
                        return b.mo67664a();
                    }
                }
            }
            bmxv = bmvz.f131120a;
            if (bmxv.mo66813a()) {
            }
            return b.mo67664a();
        }
        bmxv a8 = m19034a(lgc.f26027c, lgc.mo15061a());
        if (a8.mo66813a()) {
            return bngx.m109356a((lgb) a8.mo66814b());
        }
        return bngx.m109376e();
    }
}
