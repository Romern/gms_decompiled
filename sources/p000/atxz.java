package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* renamed from: atxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class atxz extends aeaa {

    /* renamed from: a */
    private boolean f91102a;

    /* renamed from: b */
    Messenger f91103b;

    public atxz() {
        super("tapandpay");
    }

    /* renamed from: a */
    public void mo6500a(ComponentName componentName) {
        this.f91103b = null;
    }

    /* renamed from: a */
    public void mo6501a(ComponentName componentName, IBinder iBinder) {
        this.f91103b = new Messenger(iBinder);
    }

    /* renamed from: a */
    public void mo50310a(Context context) {
        if (this.f91102a) {
            this.f91102a = false;
            skh.m35531a().mo25689a(context, this);
        }
    }

    /* renamed from: a */
    public void mo50137a(Context context, String str) {
        if (!this.f91102a) {
            this.f91102a = true;
            skh.m35531a().mo25690a(context, new Intent().setClassName(context, str), this, 1);
        }
    }

    /* renamed from: a */
    public void mo50311a(Message message) {
        Messenger messenger;
        if (this.f91102a && (messenger = this.f91103b) != null) {
            messenger.send(message);
        }
    }
}
