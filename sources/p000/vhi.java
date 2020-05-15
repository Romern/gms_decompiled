package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* renamed from: vhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class vhi extends aaab {

    /* renamed from: b */
    private static final sbw f49271b = new sbw("CachingOp", "");

    /* renamed from: a */
    protected final vhs f49272a;

    public vhi(String str, vhs vhs) {
        super(11, str);
        this.f49272a = vhs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28457a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28458a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final umn mo28459b() {
        return this.f49272a.mo28470h();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        SQLiteDatabase g;
        synchronized (this.f49272a) {
            if (!this.f49272a.mo28467e()) {
                try {
                    g = this.f49272a.mo28469g();
                    g.beginTransaction();
                    mo28458a(g);
                    if (this.f49272a.mo28467e()) {
                        g.endTransaction();
                        return;
                    }
                    g.setTransactionSuccessful();
                    g.endTransaction();
                    mo28457a();
                } catch (Exception e) {
                    throw new aaaj(8, String.format(Locale.US, "Unexpected exception while applying operation %s for %s", this.f27820m, this.f49272a), null, e);
                } catch (Throwable th) {
                    g.endTransaction();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        f49271b.mo25374b("CachingOp", "Operation failed: %s", status);
    }
}
