package p000;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.util.TypedValue;
import java.util.concurrent.Callable;

/* renamed from: ahvc */
public final /* synthetic */ class ahvc implements Callable {

    /* renamed from: a */
    private final Account f68149a;

    /* renamed from: b */
    private final Context f68150b;

    public ahvc(Account account, Context context) {
        this.f68149a = account;
        this.f68150b = context;
    }

    public final Object call() {
        ParcelFileDescriptor b;
        Account account = this.f68149a;
        Context context = this.f68150b;
        allh allh = (allh) ahvd.f68151a.mo24713a(account.name, 1, 0).mo9455a();
        try {
            b = allh.mo40486b();
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                int applyDimension = (int) TypedValue.applyDimension(1, 120.0f, context.getResources().getDisplayMetrics());
                if (a.getWidth() != a.getHeight() || a.getWidth() != applyDimension) {
                    a = suj.m36369a(a, applyDimension);
                }
                Bitmap a2 = suj.m36368a(context, a, new Paint());
                srz.m36170a(b);
                allh.mo12460c();
                return a2;
            }
            throw new NullPointerException("Failed to load image from People.Images API");
        } catch (Throwable th) {
            allh.mo12460c();
            throw th;
        }
    }
}
