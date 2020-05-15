package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.appinvite.sms.SendSmsOperation;

/* renamed from: fvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvv {

    /* renamed from: a */
    public String f17384a;

    /* renamed from: b */
    public String f17385b;

    /* renamed from: c */
    public String f17386c;

    /* renamed from: d */
    public String f17387d;

    /* renamed from: e */
    public String f17388e;

    /* renamed from: f */
    private final Intent f17389f;

    public fvv(Context context) {
        this.f17389f = IntentOperation.getStartIntent(context, SendSmsOperation.class, "com.google.android.gms.appinvite.intents.SEND_SMS");
    }

    /* renamed from: a */
    public final Intent mo11405a() {
        if (TextUtils.isEmpty(this.f17384a)) {
            throw new IllegalArgumentException("Phone number not set.");
        } else if (TextUtils.isEmpty(this.f17385b)) {
            throw new IllegalArgumentException("Message not set.");
        } else if (!TextUtils.isEmpty(this.f17386c)) {
            this.f17389f.putExtra("phoneNumber", this.f17384a);
            this.f17389f.putExtra("message", this.f17385b);
            this.f17389f.putExtra("inviteId", this.f17386c);
            this.f17389f.putExtra("accountName", this.f17387d);
            this.f17389f.putExtra("opCode", this.f17388e);
            return this.f17389f;
        } else {
            throw new IllegalArgumentException("Invite id not set.");
        }
    }
}
