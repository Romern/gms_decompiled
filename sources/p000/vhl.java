package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;

/* renamed from: vhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhl extends aaab {

    /* renamed from: a */
    private final vhs f49273a;

    /* renamed from: b */
    private final vic f49274b;

    /* renamed from: c */
    private final boolean f49275c;

    public vhl(vhs vhs, vic vic, boolean z) {
        super(11, "CloseCacheOperation");
        this.f49273a = vhs;
        this.f49274b = vic;
        this.f49275c = z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!this.f49273a.mo28467e()) {
            SQLiteDatabase g = this.f49273a.mo28469g();
            umn h = this.f49273a.mo28470h();
            h.f48229g = vil.f49336d.mo28487a(g);
            h.mo27725t();
            vio vio = vio.f49344d;
            int i = 0;
            Cursor query = g.query(vio.mo27735b(), new String[]{((unt) vio).f48341a.mo27700a()}, null, null, null, null, null, "1");
            try {
                int count = query.getCount();
                query.close();
                int i2 = h.f48229g;
                String a = vii.f49330d.mo28482a(g, "snapshotLength");
                if (a != null) {
                    i = Integer.parseInt(a);
                }
                int i3 = i2 - i;
                int intValue = ((Integer) twy.f46858ap.mo58455c()).intValue();
                this.f49273a.mo28468f();
                if (!this.f49275c) {
                    return;
                }
                if (count > 0 || i3 >= intValue) {
                    this.f49274b.mo28480a();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
    }
}
