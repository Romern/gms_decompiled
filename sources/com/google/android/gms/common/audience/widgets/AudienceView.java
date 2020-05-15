package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.people.data.Audience;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AudienceView extends FrameLayout {

    /* renamed from: c */
    private static Context f30146c;

    /* renamed from: a */
    public rqn f30147a;

    /* renamed from: b */
    public rqp f30148b;

    /* renamed from: d */
    private final Context f30149d;

    /* renamed from: e */
    private final rqj f30150e;

    public AudienceView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private static Pair m22521a(Context context) {
        if (f30146c == null) {
            f30146c = rfx.m33539c(context);
        }
        Context context2 = f30146c;
        if (context2 != null) {
            try {
                return new Pair(rqi.asInterface((IBinder) context2.getClassLoader().loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance()), f30146c);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            }
        }
        return new Pair(new rqo(), context);
    }

    /* renamed from: b */
    public final void mo17755b(boolean z) {
        try {
            this.f30150e.setShowEmptyText(z);
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parent"));
        try {
            this.f30150e.onRestoreInstanceState(bundle.getBundle("impl"));
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        try {
            bundle.putBundle("impl", this.f30150e.onSaveInstanceState());
        } catch (RemoteException e) {
        }
        return bundle;
    }

    public AudienceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudienceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Pair a = m22521a(context);
        this.f30150e = (rqj) a.first;
        this.f30149d = (Context) a.second;
        try {
            this.f30150e.initialize(vzs.m41642a(getContext()), vzs.m41642a(this.f30149d), new rql(this));
            addView((View) vzs.m41641a(this.f30150e.getView()));
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo17751a(int i, rqn rqn, rqp rqp) {
        this.f30147a = rqn;
        this.f30148b = rqp;
        try {
            this.f30150e.setEditMode(i);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo17752a(Audience audience) {
        try {
            this.f30150e.setAudience(audience);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo17753a(rqn rqn) {
        sdo.m34959a(rqn);
        mo17751a(3, rqn, null);
    }

    /* renamed from: a */
    public final void mo17754a(boolean z) {
        try {
            this.f30150e.setIsUnderageAccount(z);
        } catch (RemoteException e) {
        }
    }
}
