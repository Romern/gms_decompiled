package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.ExecutionException;

/* renamed from: axeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axeq extends aaab {

    /* renamed from: a */
    protected final Account f95862a;

    /* renamed from: b */
    protected final Bundle f95863b;

    /* renamed from: c */
    protected final IInterface f95864c;

    /* renamed from: d */
    protected final SafeParcelable f95865d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo53071a() {
        Bundle bundle = this.f95863b;
        int i = 0;
        if (bundle != null && bundle.containsKey("integrator_id")) {
            i = bzvi.m126244a(this.f95863b.getInt("integrator_id", 0));
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: b */
    public abstract void mo53072b(Context context);

    public axeq(String str, SafeParcelable safeParcelable, Account account, Bundle bundle, IInterface iInterface) {
        super(115, str);
        this.f95862a = account;
        this.f95863b = bundle;
        this.f95864c = iInterface;
        this.f95865d = safeParcelable;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            mo53072b(context);
        } catch (InterruptedException | ExecutionException e) {
            try {
                if (e.getCause() != null && (e.getCause().getCause() instanceof axmk)) {
                    mo6503a(new Status(-16501));
                } else if (e.getCause() == null || !(e.getCause().getCause() instanceof axml)) {
                    mo6503a(new Status(13));
                } else {
                    mo6503a(new Status(7));
                }
            } catch (InterruptedException | ExecutionException e2) {
                mo6503a(new Status(13));
            }
        }
    }
}
