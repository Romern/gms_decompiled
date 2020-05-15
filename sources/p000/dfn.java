package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.Log;

/* renamed from: dfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dfn extends BroadcastReceiver implements dju {

    /* renamed from: c */
    public static final dfm f13014c = new dfm();

    /* renamed from: a */
    public com.google.android.chimera.BroadcastReceiver f13015a;

    /* renamed from: b */
    public Context f13016b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final com.google.android.chimera.BroadcastReceiver mo8857a(Context context) {
        Context context2 = this.f13016b;
        if (!(context2 == null || ((ContextWrapper) context2).getBaseContext() == context)) {
            this.f13016b = null;
            this.f13015a = null;
        }
        if (this.f13016b == null) {
            mo8858b(context);
        }
        return this.f13015a;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8858b(Context context) {
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        com.google.android.chimera.BroadcastReceiver a = mo8857a(context);
        if (a != null) {
            Context context2 = this.f13016b;
            bmzs.m108696a(context2);
            intent.setExtrasClassLoader(context2.getClassLoader());
            a.onReceive(context2, intent);
            return;
        }
        String name = getClass().getName();
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + String.valueOf(action).length());
        sb.append(name);
        sb.append(" dropping broadcast ");
        sb.append(action);
        Log.e("ChimeraRcvrProxy", sb.toString());
    }
}
