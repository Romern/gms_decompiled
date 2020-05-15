package p000;

import android.content.Context;
import com.google.android.chimera.Loader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: jyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyp extends Loader {

    /* renamed from: a */
    public static final sek f23538a = ght.m13171a("MinuteMaid", "DroidGuardLoader");

    /* renamed from: b */
    public final String f23539b;

    /* renamed from: c */
    public final Context f23540c;

    /* renamed from: d */
    public final Collection f23541d = new LinkedList();

    /* renamed from: e */
    public jyn f23542e;

    public jyp(Context context, String str) {
        super(context);
        this.f23539b = str;
        this.f23540c = context;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        Iterator it = this.f23541d.iterator();
        while (it.hasNext()) {
            ((jyo) it.next()).cancel(true);
            it.remove();
        }
        jyn jyn = this.f23542e;
        if (jyn != null) {
            jyn.mo14230a();
            this.f23542e.cancel(true);
            this.f23542e = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f23542e == null) {
            jyn jyn = new jyn(this);
            this.f23542e = jyn;
            jyn.execute(new Void[0]);
        }
    }
}
