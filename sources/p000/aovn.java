package p000;

import android.content.Context;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

/* renamed from: aovn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovn extends aovg {

    /* renamed from: h */
    private final TaskEntity f83687h;

    /* renamed from: i */
    private final CreateReminderOptionsInternal f83688i;

    /* renamed from: j */
    private String f83689j;

    public aovn(aost aost, String str, String str2, TaskEntity taskEntity, CreateReminderOptionsInternal createReminderOptionsInternal) {
        super(aost, str, str2, "CreateReminder");
        this.f83687h = taskEntity;
        this.f83688i = createReminderOptionsInternal;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo46933a() {
        return 6001;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
        blox blox;
        bxvd da = blpo.f127258h.mo74144da();
        blrj a = aoww.m69746a(this.f83687h);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        blrj blrj = (blrj) bxvd.f164949b;
        if ((blrj.f127458a & 4) != 0) {
            blrn blrn = blrj.f127461d;
            if (blrn == null) {
                blrn = blrn.f127488c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpo blpo = (blpo) da.f164949b;
            blrn.getClass();
            blpo.f127262c = blrn;
            blpo.f127260a |= 2;
        }
        blrk b = mo46944b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpo blpo2 = (blpo) da.f164949b;
        b.getClass();
        blpo2.f127261b = b;
        blpo2.f127260a |= 1;
        blrj blrj2 = (blrj) bxvd.f164949b;
        if ((blrj2.f127458a & 1) != 0) {
            blox = blrj2.f127459b;
            if (blox == null) {
                blox = blox.f127160d;
            }
        } else {
            bxvd da2 = blox.f127160d.mo74144da();
            String str = this.f83689j;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            blox blox2 = (blox) da2.f164949b;
            str.getClass();
            blox2.f127162a |= 2;
            blox2.f127163b = str;
            blox = (blox) da2.mo74062i();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpo blpo3 = (blpo) da.f164949b;
        blox.getClass();
        blpo3.f127263d = blox;
        blpo3.f127260a |= 4;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blrj blrj3 = (blrj) bxvd.f164949b;
        blrj blrj4 = blrj.f127456w;
        blrj3.f127459b = null;
        int i = blrj3.f127458a & -2;
        blrj3.f127458a = i;
        blrj3.f127461d = null;
        int i2 = i & -5;
        blrj3.f127458a = i2;
        int i3 = i2 & -129;
        blrj3.f127458a = i3;
        blrj3.f127466i = false;
        blrj3.f127476s = null;
        int i4 = i3 & -262145;
        blrj3.f127458a = i4;
        blrj3.f127460c = null;
        blrj3.f127458a = i4 & -3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpo blpo4 = (blpo) da.f164949b;
        blrj blrj5 = (blrj) bxvd.mo74062i();
        blrj5.getClass();
        blpo4.f127264e = blrj5;
        blpo4.f127260a |= 8;
        boolean z = this.f83688i.f107036d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blpo blpo5 = (blpo) da.f164949b;
        blpo5.f127260a |= 16;
        blpo5.f127265f = z;
        String str2 = this.f83688i.f107035c;
        boolean z2 = str2 != null && !str2.isEmpty();
        String str3 = this.f83688i.f107034b;
        boolean z3 = str3 != null && !str3.isEmpty();
        if (z2 || z3) {
            bxvd da3 = bxbq.f162727d.mo74144da();
            String str4 = this.f83688i.f107034b;
            if (str4 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxbq bxbq = (bxbq) da3.f164949b;
                str4.getClass();
                bxbq.f162729a |= 1;
                bxbq.f162730b = str4;
            }
            String str5 = this.f83688i.f107035c;
            if (str5 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxbq bxbq2 = (bxbq) da3.f164949b;
                str5.getClass();
                bxbq2.f162729a |= 2;
                bxbq2.f162731c = str5;
            }
            bxvd da4 = blnl.f126994c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            blnl blnl = (blnl) da4.f164949b;
            bxbq bxbq3 = (bxbq) da3.mo74062i();
            bxbq3.getClass();
            blnl.f126997b = bxbq3;
            blnl.f126996a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blpo blpo6 = (blpo) da.f164949b;
            blnl blnl2 = (blnl) da4.mo74062i();
            blnl2.getClass();
            blpo6.f127266g = blnl2;
            blpo6.f127260a |= 128;
        }
        arrayList.add(mo46934a(1, (blpo) da.mo74062i()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aovg.a(android.content.Context, boolean):boolean
     arg types: [android.content.Context, int]
     candidates:
      aovg.a(int, bxxc):android.content.ContentProviderOperation
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskEntity):java.lang.String
      aovg.a(java.util.ArrayList, com.google.android.gms.reminders.model.TaskId):void
      aovg.a(java.util.ArrayList, java.lang.String):void
      aovg.a(com.google.android.gms.reminders.model.Task, boolean):boolean
      aovg.a(java.lang.String, com.google.android.gms.reminders.UpdateRecurrenceOptions):java.lang.String[]
      aovg.a(android.content.Context, boolean):boolean */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        aowq aowq = new aowq(context);
        boolean z2 = true;
        if (aowq.f83774c == -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Cannot start timer twice");
        aowq.f83774c = System.currentTimeMillis();
        if (mo46940a(context, false)) {
            aovd.m69610a().mo46932a(this.f83689j, this.f83675g);
            aowf.m69693a(this.f83672d);
            if (aowq.f83774c == -1) {
                z2 = false;
            }
            sdo.m34975b(z2, "Start the timer before stop");
            long currentTimeMillis = System.currentTimeMillis() - aowq.f83774c;
            Context context2 = aowq.f83775d;
            if (aowq.f83772a == null) {
                synchronized (aowq.f83773b) {
                    if (aowq.f83772a == null) {
                        aowq.f83772a = fip.m11765a(context2).mo10855a((String) aoss.f83526E.mo58455c());
                        fjk fjk = aowq.f83772a;
                        synchronized (fjk) {
                            if (fjk.f16724c == null) {
                                fjk.f16724c = new fin(fjk, Thread.getDefaultUncaughtExceptionHandler(), fjk.mo10939f());
                                Thread.setDefaultUncaughtExceptionHandler(fjk.f16724c);
                                fjk.mo10933d("Uncaught exceptions will be reported to Google Analytics");
                            }
                        }
                        aowq.f83772a.mo10894b("Reminders");
                        aowq.f83772a.mo10895c("201515000");
                    }
                }
            }
            fjk fjk2 = aowq.f83772a;
            fis fis = new fis();
            fis.mo10868a(aowq.f83776e);
            fis.mo10870f(aowq.f83778g);
            fis.mo10869b(currentTimeMillis);
            fjk2.mo10893a(fis.mo10861a());
            String str = aowq.f83776e;
            String str2 = aowq.f83777f;
            String str3 = aowq.f83778g;
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 66 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append("Send event [Category:");
            sb.append(str);
            sb.append(", Action:");
            sb.append(str2);
            sb.append(", Label");
            sb.append(str3);
            sb.append(", Value:");
            sb.append(currentTimeMillis);
            sb.append("]");
            sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
        this.f83689j = mo46935a(arrayList, this.f83687h);
    }
}
