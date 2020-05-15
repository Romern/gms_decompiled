package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import com.google.android.chimera.Activity;
import com.google.android.gms.walletp2p.feature.common.transferparams.TransferParams;
import java.util.List;

/* renamed from: axfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axfk extends axfi {
    public axfk(TransferParams transferParams, Intent intent) {
        super(transferParams, intent);
    }

    /* renamed from: a */
    public final int mo53073a() {
        return 0;
    }

    /* renamed from: b */
    public final String mo53079b(Context context) {
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }

    /* renamed from: b */
    public final boolean mo53080b() {
        return true;
    }

    /* renamed from: c */
    public final String mo53081c(Context context) {
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }

    /* renamed from: c */
    public final boolean mo53082c() {
        return false;
    }

    /* renamed from: d */
    public final String mo53083d(Context context) {
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }

    /* renamed from: d */
    public final boolean mo53084d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo53086e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo53088f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo53089g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo53090h() {
        return true;
    }

    /* renamed from: i */
    public final boolean mo53091i() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo53092j() {
        throw new IllegalStateException("The done button is meant for the end of a transfer, and view cannot be in this state.");
    }

    /* renamed from: l */
    public final boolean mo53094l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo53098m() {
        return false;
    }

    /* renamed from: n */
    public final boolean mo53102n() {
        return chlh.m148921b();
    }

    /* renamed from: o */
    public final boolean mo53103o() {
        return true;
    }

    /* renamed from: a */
    public final Spanned mo53074a(Context context, String str) {
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }

    /* renamed from: a */
    public final String mo53075a(Context context) {
        throw new IllegalStateException("Cannot complete a transfer in this mode.");
    }

    /* renamed from: a */
    public final void mo53076a(Context context, axif axif, Account account, axls axls, axls axls2) {
        if (!chlb.m148912b()) {
            axls.mo53097a(btsj.f150218c);
            return;
        }
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }

    /* renamed from: a */
    public final void mo53077a(axif axif, Account account, axhe axhe) {
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }

    /* renamed from: a */
    public final void mo53078a(Activity activity, axif axif, Account account, rjx rjx, long j, long j2, byte[] bArr, List list, axfh axfh, String str) {
        throw new IllegalStateException("Cannot perform a transfer in this mode.");
    }
}
