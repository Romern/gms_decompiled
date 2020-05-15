package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.chimera.Activity;
import com.google.android.gms.mdm.BaseLockscreenChimeraActivity$1;

/* renamed from: afys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afys extends Activity implements View.OnClickListener {

    /* renamed from: a */
    protected static final IntentFilter f64979a = new IntentFilter("com.google.android.gms.mdm.DISMISS_MESSAGE");

    /* renamed from: b */
    public ImageButton f64980b;

    /* renamed from: c */
    protected String f64981c;

    /* renamed from: d */
    protected aki f64982d;

    /* renamed from: e */
    protected final BroadcastReceiver f64983e = new BaseLockscreenChimeraActivity$1(this, "security");

    /* renamed from: a */
    public static Intent m53682a(Context context, String str, String str2, boolean z) {
        Intent a = apuh.m71022a(context, "com.google.android.gms.mdm.LockscreenActivity");
        a.putExtra("lock_message", str);
        if (!TextUtils.isEmpty(str2)) {
            a.putExtra("phone_number", str2);
        }
        a.setFlags(1350565888);
        if (z) {
            a.addFlags(536870912);
        } else {
            a.addFlags(67108864);
        }
        return a;
    }
}
