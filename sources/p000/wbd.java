package p000;

import android.accounts.Account;
import android.net.Uri;

/* renamed from: wbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wbd extends wdc {

    /* renamed from: a */
    public final int f50379a;

    /* renamed from: b */
    public final Account f50380b;

    /* renamed from: c */
    private final Uri f50381c;

    public wbd(int i, Account account, Uri uri) {
        this.f50379a = i;
        this.f50380b = account;
        this.f50381c = uri;
    }

    /* renamed from: a */
    public final int mo29013a() {
        return this.f50379a;
    }

    /* renamed from: b */
    public final Account mo29014b() {
        return this.f50380b;
    }

    /* renamed from: c */
    public final Uri mo29015c() {
        return this.f50381c;
    }

    public final boolean equals(Object obj) {
        Account account;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wdc)) {
            return false;
        }
        wdc wdc = (wdc) obj;
        return this.f50379a == wdc.mo29013a() && ((account = this.f50380b) == null ? wdc.mo29014b() == null : account.equals(wdc.mo29014b())) && ((uri = this.f50381c) == null ? wdc.mo29015c() == null : uri.equals(wdc.mo29015c()));
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f50379a ^ 1000003) * 1000003;
        Account account = this.f50380b;
        int i3 = 0;
        if (account != null) {
            i = account.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 ^ i) * 1000003;
        Uri uri = this.f50381c;
        if (uri != null) {
            i3 = uri.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        int i = this.f50379a;
        String valueOf = String.valueOf(this.f50380b);
        String valueOf2 = String.valueOf(this.f50381c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(valueOf2).length());
        sb.append("Response{type=");
        sb.append(i);
        sb.append(", selectedAccount=");
        sb.append(valueOf);
        sb.append(", url=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
