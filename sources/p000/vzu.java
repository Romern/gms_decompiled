package p000;

import android.content.Context;
import android.os.IBinder;

/* renamed from: vzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vzu {

    /* renamed from: a */
    private final String f50298a;

    /* renamed from: b */
    private Object f50299b;

    protected vzu(String str) {
        this.f50298a = str;
    }

    /* renamed from: a */
    public final Object mo29000a(Context context) {
        if (this.f50299b == null) {
            sdo.m34959a(context);
            Context i = rfy.m33552i(context);
            if (i != null) {
                try {
                    this.f50299b = mo6585a((IBinder) i.getClassLoader().loadClass(this.f50298a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new vzt("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new vzt("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new vzt("Could not access creator.", e3);
                }
            } else {
                throw new vzt("Could not get remote context.");
            }
        }
        return this.f50299b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo6585a(IBinder iBinder);
}
