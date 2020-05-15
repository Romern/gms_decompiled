package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: aaro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaro implements Runnable {

    /* renamed from: a */
    private final aarp f56369a;

    /* renamed from: b */
    private final WeakReference f56370b;

    /* renamed from: c */
    private final Context f56371c;

    /* renamed from: d */
    private final HelpConfig f56372d;

    public aaro(aarn aarn, Context context, HelpConfig helpConfig) {
        this.f56369a = new aarp(context, helpConfig);
        this.f56370b = new WeakReference(aarn);
        this.f56371c = context;
        this.f56372d = helpConfig;
    }

    /* renamed from: b */
    private final void m46795b(String str) {
        for (AccountChangeEvent accountChangeEvent : gie.m13191a(this.f56371c, 0, str)) {
            if (accountChangeEvent.f9907d == 3) {
                String str2 = accountChangeEvent.f9909f;
                if (!TextUtils.isEmpty(str2)) {
                    aarp aarp = new aarp(this.f56371c, this.f56372d);
                    aarp.f56374a = aarp.m46798c(str2);
                    if (aarp.mo31693a("last_seen_account_change_index", -1) < accountChangeEvent.f9908e) {
                        m46795b(str2);
                        aarp aarp2 = new aarp(this.f56371c, this.f56372d);
                        aarp2.f56374a = aarp.m46798c(str);
                        aasa a = aarp2.mo31695a();
                        aarp aarp3 = new aarp(this.f56371c, this.f56372d);
                        aarp3.f56374a = aarp.m46798c(str2);
                        aasa a2 = aarp3.mo31695a();
                        C1245ok a3 = aasj.m46867a(this.f56372d);
                        int i = a3.f26809h;
                        for (int i2 = 0; i2 < i; i2++) {
                            String str3 = (String) a3.mo15620b(i2);
                            Object c = a3.mo15621c(i2);
                            if (aarp3.mo31657b(str3)) {
                                if (c instanceof Boolean) {
                                    a.mo31690a(str3, aarp3.mo31699a(str3, ((Boolean) c).booleanValue()));
                                } else if (c instanceof String) {
                                    a.mo31689a(str3, aarp3.mo31697a(str3, (String) c));
                                } else if (c instanceof Integer) {
                                    a.mo31687a(str3, aarp3.mo31693a(str3, ((Integer) c).intValue()));
                                } else if (c instanceof Long) {
                                    a.mo31688a(str3, aarp3.mo31694a(str3, ((Long) c).longValue()));
                                } else if (c instanceof Float) {
                                    throw new UnsupportedOperationException("Float not supported.");
                                }
                                a2.mo31686a(str3);
                            }
                        }
                        a2.mo31686a("is_account_in_prefs");
                        a.mo31685a();
                        a2.mo31685a();
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasa.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aasa.a(java.lang.String, int):void
      aasa.a(java.lang.String, long):void
      aasa.a(java.lang.String, java.lang.String):void
      aasa.a(java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31654a(String str) {
        aarp aarp = this.f56369a;
        aarp.f56374a = str;
        aasa a = aarp.mo31695a();
        a.mo31690a("is_account_in_prefs", true);
        a.mo31685a();
        aarn aarn = (aarn) this.f56370b.get();
        if (aarn != null) {
            aarn.mo31653a(this.f56369a);
        }
    }

    public final void run() {
        Account account = this.f56372d.f78829d;
        if (account == null || this.f56371c == null) {
            mo31654a("");
            return;
        }
        String str = account.name;
        try {
            m46795b(str);
            mo31654a(aarp.m46798c(str));
        } catch (gid | IOException e) {
            Log.w("gH_AcctSpecificPrfInit", "Failed to get account ID.", e);
            mo31654a("");
        }
    }
}
