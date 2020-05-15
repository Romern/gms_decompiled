package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: aebp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aebp implements aebs {

    /* renamed from: a */
    protected final Context f63081a;

    /* renamed from: b */
    private final PendingIntent f63082b;

    /* renamed from: c */
    private final int f63083c;

    /* renamed from: d */
    private final int f63084d;

    public aebp(Context context, int i, int i2) {
        this.f63081a = context;
        this.f63083c = i;
        this.f63084d = i2;
        this.f63082b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    /* renamed from: a */
    private final Intent m51581a(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.f63082b);
        intent.putExtra("source", this.f63083c);
        intent.putExtra("source_version", 201515000);
        intent.putExtra("scheduler_action", str);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo34016a(aeca aeca) {
        Intent a = m51581a("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        aeca.mo33975a(bundle, this.f63084d);
        a.putExtras(bundle);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo34017a(ComponentName componentName) {
        Intent a = m51581a("CANCEL_ALL");
        a.putExtra("component", componentName);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo34018a(ComponentName componentName, String str) {
        Intent a = m51581a("CANCEL_TASK");
        a.putExtra("component", componentName);
        a.putExtra("tag", str);
        return a;
    }
}
