package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: axcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcp extends bkig {

    /* renamed from: g */
    private String f95784g;

    /* renamed from: a */
    public static axcp m82327a(bmdj bmdj, int i, String str, LogContext logContext) {
        axcp axcp = new axcp();
        Bundle a = bkdx.m105383a(i, bmdj, logContext);
        a.putString("analyticsId", str);
        axcp.setArguments(a);
        return axcp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95784g = getArguments().getString("analyticsId");
        return super.mo51901a(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bkjj mo53017a(bmeb bmeb, int i, LogContext logContext) {
        return awzs.m81798a(bmeb, i, this.f95784g, logContext);
    }
}
