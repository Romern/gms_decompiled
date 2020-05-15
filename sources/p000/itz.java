package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: itz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itz extends aaab {

    /* renamed from: a */
    private final rnt f21752a;

    /* renamed from: b */
    private final Account f21753b;

    /* renamed from: c */
    private final String f21754c;

    /* renamed from: d */
    private final byte[] f21755d;

    /* renamed from: e */
    private final List f21756e;

    public itz(rnt rnt, String str, Account account, byte[] bArr, List list) {
        super(129, "RegisterGroupForDeviceSyncOperation");
        this.f21752a = rnt;
        this.f21753b = account;
        this.f21754c = str;
        this.f21755d = bArr;
        this.f21756e = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        if (ccfa.m129418b()) {
            ipy ipy = new ipy(context, this.f21753b.name);
            String str = this.f21754c;
            synchronized (ipy.f21538a) {
                Set stringSet = ipy.f21539b.getStringSet(ipy.mo13244a("ALL_KEYS", "ALL_KEY_NAMES"), null);
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                stringSet.add(str);
                ipy.f21539b.edit().putStringSet(ipy.mo13244a("ALL_KEYS", "ALL_KEY_NAMES"), bnpf.m110049a((Iterable) stringSet)).commit();
            }
            String str2 = this.f21754c;
            List list = this.f21756e;
            synchronized (ipy.f21538a) {
                ipy.f21539b.edit().putStringSet(ipy.mo13244a("FEATURE", str2), bnpf.m110049a(list)).commit();
            }
            if (!Arrays.equals(this.f21755d, ipy.mo13245a(this.f21754c))) {
                ipy.mo13246b(this.f21754c);
            }
            String str3 = this.f21754c;
            byte[] bArr = this.f21755d;
            synchronized (ipy.f21538a) {
                ipy.f21539b.edit().putString(ipy.mo13244a("METADATA", str3), sqd.m35972d(bArr)).commit();
            }
            iqb a = iqa.m15886a(context, this.f21753b, isr.m16057a(context, 0, 3));
            z = iqe.m15892a(context, a).mo13258a(this.f21753b, this.f21754c, this.f21755d, this.f21756e, 0, (String) null);
            a.mo13254a();
            if (!z) {
                iqg.m15898a(context).mo13259a(this.f21753b);
            }
        } else {
            z = true;
        }
        this.f21752a.mo11797a(!z ? Status.f30109c : Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21752a.mo11797a(status);
    }
}
