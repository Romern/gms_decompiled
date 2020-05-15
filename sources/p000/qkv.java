package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.ModuleContext;

/* renamed from: qkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qkv extends dfn {

    /* renamed from: d */
    private aabl f41625d = null;

    protected qkv() {
        qlp.m32393a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            context = new rpg(context);
        }
        this.f41625d = new aabl(context, broadcastReceiver.getClass(), 4);
        Context a = aabj.m21054a(context);
        this.f13015a = broadcastReceiver;
        this.f13016b = a;
        this.f13015a.setProxy(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8858b(Context context) {
        if (!rpr.m34216b().getInSafeBoot()) {
            dfn.f13014c.mo9147a(context, this);
        }
    }

    /* renamed from: c */
    public final void mo9145c() {
        qmc.m32424a(true);
    }

    public final void onReceive(Context context, Intent intent) {
        blji blji;
        adyw a;
        ssh.m36214e();
        if (this.f41625d == null) {
            mo8857a(context);
        }
        aabl aabl = this.f41625d;
        if (aabl != null) {
            blji = aabl.mo16695a("onReceive", intent);
        } else {
            blji = null;
        }
        try {
            a = adyv.m51453a();
            BroadcastReceiver a2 = mo8857a(context);
            if (a2 == null) {
                String name = getClass().getName();
                String action = intent.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + String.valueOf(action).length());
                sb.append(name);
                sb.append(" dropping broadcast ");
                sb.append(action);
                Log.e("ChimeraRcvrProxy", sb.toString());
            } else {
                Context context2 = this.f13016b;
                bmzs.m108696a(context2);
                intent.setExtrasClassLoader(context2.getClassLoader());
                a2.onReceive(context2, intent);
            }
            if (a != null) {
                a.close();
            }
            if (blji != null) {
                blji.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (blji != null) {
                try {
                    blji.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: c */
    public final boolean mo9146c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, name), 128);
            if (!(receiverInfo.metaData == null || (string = receiverInfo.metaData.getString("chimera.requiresExtractedAsset")) == null)) {
                qlp a = qlp.m32393a();
                StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
                sb.append(string);
                sb.append(" ");
                sb.append(name);
                a.mo8861a(context, 82, sb.toString());
                qmc.m32416a();
                qmc.m32420a(context, string);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
