package p000;

import android.content.Context;

/* renamed from: awpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpu extends bjfk {

    /* renamed from: a */
    private static final bnic f94821a = bnic.m109490a("Bender3ProcessBuyFlowResultAction", "Bender3RefreshUserSpecificDataAction");

    /* renamed from: b */
    private final Context f94822b;

    public awpu(Context context) {
        this.f94822b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* renamed from: a */
    public final bjfd mo52450a(bjfc bjfc) {
        char c;
        String a = bjfc.mo65078a();
        int hashCode = a.hashCode();
        if (hashCode != -1484977397) {
            if (hashCode == -401940539 && a.equals("Bender3ProcessBuyFlowResultAction")) {
                c = 0;
                if (c == 0) {
                    Context context = this.f94822b;
                    return new awpv(context, new awwt(context, rjx.m33696b(context)), new awsm(), new awsz(this.f94822b), new awta(this.f94822b)).mo52455a(bjfc);
                } else if (c == 1) {
                    Context context2 = this.f94822b;
                    return new awpw(new awwt(context2, rjx.m33696b(context2)), new awta(this.f94822b)).mo52455a(bjfc);
                } else {
                    throw new IllegalStateException("unsupported action request");
                }
            }
        } else if (a.equals("Bender3RefreshUserSpecificDataAction")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bnic mo52456a() {
        return f94821a;
    }
}
