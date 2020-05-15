package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;

/* renamed from: arwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwt {

    /* renamed from: a */
    private static final asco f88381a = ascp.m73787a("Setup", "UI", "AccountTransferDelegate");

    /* renamed from: b */
    private final ArrayList f88382b;

    /* renamed from: c */
    private final Activity f88383c;

    /* renamed from: d */
    private boolean f88384d;

    /* renamed from: e */
    private Fragment f88385e;

    /* renamed from: f */
    private boolean f88386f = false;

    /* renamed from: g */
    private final aryb f88387g;

    public arwt(Activity activity, aryb aryb, Bundle bundle) {
        this.f88383c = activity;
        this.f88387g = aryb;
        if (bundle != null) {
            this.f88382b = bundle.getParcelableArrayList("AccountTransferDelegate.pendingIntents");
        } else {
            this.f88382b = new ArrayList();
        }
    }

    /* renamed from: a */
    private final void m73631a(PendingIntent pendingIntent) {
        Activity activity;
        Intent intent;
        try {
            this.f88384d = true;
            f88381a.mo25409a("startingIntentForResult %s", pendingIntent);
            Fragment fragment = this.f88385e;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = this.f88383c;
            }
            sdo.m34959a(activity);
            if (cgrb.m146732b()) {
                Intent intent2 = new Intent();
                bizc.m103024a(activity.getIntent(), intent2);
                intent = intent2;
            } else {
                intent = null;
            }
            Fragment fragment2 = this.f88385e;
            if (fragment2 != null) {
                fragment2.startIntentSenderForResult(pendingIntent.getIntentSender(), 3, intent, 0, 0, 0, Bundle.EMPTY);
            } else {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 3, intent, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e) {
            f88381a.mo25417e("PendingIntent failed to send", e, new Object[0]);
            this.f88384d = false;
        }
    }

    /* renamed from: b */
    public final void mo48891b() {
        this.f88386f = true;
    }

    /* renamed from: a */
    public final void mo48887a() {
        this.f88386f = false;
        if (!this.f88384d && !this.f88382b.isEmpty()) {
            m73631a((PendingIntent) this.f88382b.remove(0));
        }
    }

    /* renamed from: a */
    public final void mo48888a(int i, int i2) {
        if (i == 3) {
            this.f88384d = false;
            Bundle bundle = new Bundle();
            bundle.putInt("pendingIntentResult", i2);
            aryb aryb = this.f88387g;
            if (aryb != null) {
                aryb.f88443a.f108204g.mo48923a(bundle);
            }
            if (!this.f88382b.isEmpty()) {
                m73631a((PendingIntent) this.f88382b.remove(0));
            } else {
                this.f88385e = null;
            }
        } else {
            throw new IllegalArgumentException("Invalid request code");
        }
    }

    /* renamed from: a */
    public final void mo48889a(Bundle bundle) {
        bundle.putParcelableArrayList("AccountTransferDelegate.pendingIntents", this.f88382b);
    }

    /* renamed from: a */
    public final void mo48890a(Fragment fragment, PendingIntent pendingIntent) {
        f88381a.mo25409a("Delegating pendingIntent %s", pendingIntent);
        if (this.f88386f || !this.f88382b.isEmpty() || this.f88384d) {
            this.f88382b.add(pendingIntent);
            return;
        }
        this.f88385e = fragment;
        m73631a(pendingIntent);
    }
}
