package com.google.android.gms.smartdevice.d2d.p065ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/* renamed from: com.google.android.gms.smartdevice.d2d.ui.ForwardingChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ForwardingChimeraActivity extends deu {

    /* renamed from: b */
    private static final asco f108014b = ascp.m73787a("ForwardingChimeraActivity");

    /* renamed from: c */
    private ResultReceiver f108015c;

    /* renamed from: d */
    private Queue f108016d;

    /* renamed from: e */
    private Intent f108017e;

    /* renamed from: a */
    public static PendingIntent m92735a(Context context, ResultReceiver resultReceiver, PendingIntent pendingIntent) {
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
        intent.putExtra("pendingIntent", pendingIntent);
        intent.putExtra("resultReceiver", m92737a(resultReceiver));
        return PendingIntent.getActivity(context.getApplicationContext(), 2, intent, 134217728);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            this.f108015c.send(-1, null);
            finish();
            return;
        }
        Intent intent2 = (Intent) this.f108016d.poll();
        if (intent2 == null) {
            this.f108015c.send(-1, null);
            finish();
            return;
        }
        Intent intent3 = this.f108017e;
        if (intent3 != null) {
            intent2.fillIn(intent3, 0);
        }
        startActivityForResult(intent2, 1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (cgrb.m146732b()) {
            Intent intent2 = new Intent();
            this.f108017e = intent2;
            bizc.m103024a(intent, intent2);
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver == null) {
            f108014b.mo25416d("No receiver", new Object[0]);
            finish();
            return;
        }
        this.f108015c = resultReceiver;
        if (bundle == null) {
            arrayList = intent.getParcelableArrayListExtra("intents");
        } else {
            arrayList = bundle.getParcelableArrayList("intents");
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pendingIntent");
        if (pendingIntent == null) {
            if (arrayList == null) {
                f108014b.mo25416d("No intents given", new Object[0]);
                finish();
                return;
            }
            ArrayDeque arrayDeque = new ArrayDeque(arrayList);
            this.f108016d = arrayDeque;
            if (bundle == null) {
                Intent intent3 = (Intent) arrayDeque.poll();
                if (intent3 == null) {
                    f108014b.mo25416d("No intents to forward", new Object[0]);
                    finish();
                    return;
                }
                Intent intent4 = this.f108017e;
                if (intent4 != null) {
                    intent3.fillIn(intent4, 0);
                }
                startActivityForResult(intent3, 1);
            }
        } else if (bundle == null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 2, this.f108017e, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                f108014b.mo25417e("Failed sending intent", e, new Object[0]);
                this.f108015c.send(2, null);
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Queue queue = this.f108016d;
        if (queue != null) {
            bundle.putParcelableArrayList("intents", new ArrayList(queue));
        }
    }

    public final void finish() {
        int i = Build.VERSION.SDK_INT;
        finishAndRemoveTask();
    }

    /* renamed from: a */
    public static PendingIntent m92736a(Context context, ResultReceiver resultReceiver, ArrayList arrayList) {
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
        intent.putParcelableArrayListExtra("intents", arrayList);
        intent.putExtra("resultReceiver", m92737a(resultReceiver));
        return PendingIntent.getActivity(context.getApplicationContext(), 1, intent, 134217728);
    }

    /* renamed from: a */
    private static ResultReceiver m92737a(ResultReceiver resultReceiver) {
        if (!cgrb.m146732b()) {
            return resultReceiver;
        }
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
