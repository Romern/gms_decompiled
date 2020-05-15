package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: bata */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bata extends batd {

    /* renamed from: a */
    public final String f101690a;

    /* renamed from: b */
    public final Account f101691b;

    /* renamed from: c */
    public final byte[] f101692c;

    public bata(String str, Account account, byte[] bArr) {
        if (str != null) {
            this.f101690a = str;
            if (account != null) {
                this.f101691b = account;
                if (bArr != null) {
                    this.f101692c = bArr;
                    return;
                }
                throw new NullPointerException("Null channelId");
            }
            throw new NullPointerException("Null account");
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final String mo55940a() {
        return this.f101690a;
    }

    /* renamed from: b */
    public final Account mo55941b() {
        return this.f101691b;
    }

    /* renamed from: c */
    public final byte[] mo55942c() {
        return this.f101692c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof batd) {
            batd batd = (batd) obj;
            if (this.f101690a.equals(batd.mo55940a()) && this.f101691b.equals(batd.mo55941b())) {
                if (Arrays.equals(this.f101692c, batd instanceof bata ? ((bata) batd).f101692c : batd.mo55942c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f101690a.hashCode() ^ 1000003) * 1000003) ^ this.f101691b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f101692c);
    }

    public final String toString() {
        String str = this.f101690a;
        String valueOf = String.valueOf(this.f101691b);
        String arrays = Arrays.toString(this.f101692c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 54 + String.valueOf(valueOf).length() + String.valueOf(arrays).length());
        sb.append("MdhBroadcastListenerKey{action=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
