package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.common.api.Status;

/* renamed from: mnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mnp extends aaab {

    /* renamed from: a */
    private final rnt f34044a;

    /* renamed from: b */
    private final boolean f34045b;

    /* renamed from: c */
    private final String f34046c;

    /* renamed from: d */
    private final BackupOptInSettings f34047d;

    public mnp(rnt rnt, boolean z, String str, BackupOptInSettings backupOptInSettings) {
        super(182, "EnableAndroidBackup");
        this.f34044a = rnt;
        this.f34045b = z;
        this.f34046c = str;
        this.f34047d = backupOptInSettings;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvr.b(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      lvr.b(android.content.Context, int):void
      lvr.b(android.content.Context, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvr.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      lvr.a(android.content.Context, int):void
      lvr.a(android.content.Context, long):void
      lvr.a(android.content.Context, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (this.f34045b && this.f34046c == null) {
            throw new aaaj(5, "accountName cannot be null");
        }
        lvp lvp = new lvp(context);
        lsp lsp = new lsp(context);
        if (this.f34045b) {
            lsp.mo19592a(new Account(this.f34046c, "com.google"));
        }
        lvp.mo19642a(this.f34045b);
        if (this.f34045b && this.f34047d != null) {
            lvr lvr = lvr.f33060a;
            boolean z = true;
            if (this.f34047d.f28984a) {
                lvr.mo19654b(context, true);
            }
            if (this.f34047d.f28985b) {
                lvr.mo19656c(context, true);
            }
            if (this.f34047d.f28986c) {
                lvr.mo19651a(context, true);
            }
            if (this.f34047d.f28987d) {
                if (!lwb.m24519c() || !this.f34047d.f28987d) {
                    z = false;
                }
                lvr.mo19658d(context, z);
            }
        }
        this.f34044a.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f34044a.mo11797a(status);
    }
}
