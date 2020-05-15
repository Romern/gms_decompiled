package p000;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: acwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwv {

    /* renamed from: a */
    private final acwt f60989a = new acwt();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r0.f9551c != false) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* renamed from: b */
    private final List m49910b(GetRecentContextCall$Request getRecentContextCall$Request, acrm acrm) {
        Account account;
        GetRecentContextCall$Request getRecentContextCall$Request2 = getRecentContextCall$Request;
        acrm acrm2 = acrm;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f60989a.entrySet()) {
            String str = (String) entry.getKey();
            if (TextUtils.isEmpty(getRecentContextCall$Request2.f9553e) || getRecentContextCall$Request2.f9553e.equals(str)) {
                if (acrm2 != null && (!cemw.m137399g() || acrm2.f60627a.contains("app-params") ? acrm2.f60627a.getBoolean(acrl.m49740a(str), false) : !acrl.m49741b(acrm2.f60628b, str))) {
                    absg.m48202d("Package %s is blacklisted and excluded from getRecentContext() result", str);
                } else {
                    acws acws = (acws) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    if (!acws.f60987b) {
                        if (!((Boolean) abzt.f58836D.mo58455c()).booleanValue()) {
                            absg.m48201d("Third-party context is disabled for getRecentContext().");
                        }
                        if (getRecentContextCall$Request2.f9552d) {
                            Collections.sort(arrayList2, new acwu());
                            int size = arrayList2.size();
                            for (int i = 0; i < size; i++) {
                                UsageInfo usageInfo = (UsageInfo) arrayList2.get(i);
                                if (usageInfo.f9696c == 3 || usageInfo.f9701h == 2) {
                                    break;
                                }
                                arrayList.add(usageInfo);
                            }
                        } else {
                            arrayList.addAll(arrayList2);
                        }
                    }
                    List list = acws.f60986a;
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        UsageInfo usageInfo2 = (UsageInfo) list.get(i2);
                        Account account2 = getRecentContextCall$Request2.f9549a;
                        DocumentContents documentContents = usageInfo2.f9698e;
                        if (account2 != null && documentContents != null && (account = documentContents.f9533d) != null && !account.equals(account2)) {
                            absg.m48188a("Drop UsageInfo. Mismatch between requested account (%s) and the document's account (%s) in package (%s)", account2, account, str);
                        } else if (getRecentContextCall$Request2.f9550b || !usageInfo2.f9699f) {
                            arrayList2.add(usageInfo2);
                        }
                    }
                    if (getRecentContextCall$Request2.f9552d) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new acwu());
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized List mo33179a(GetRecentContextCall$Request getRecentContextCall$Request, acrm acrm) {
        return m49910b(getRecentContextCall$Request, acrm);
    }

    /* renamed from: a */
    public final synchronized void mo33180a(UsageInfo usageInfo, boolean z) {
        String str = usageInfo.f9694a.f9534a;
        acws acws = (acws) this.f60989a.remove(str);
        if (acws == null) {
            acws = new acws(new ArrayList(5), z);
        }
        List list = acws.f60986a;
        list.add(usageInfo);
        if (list.size() > 5) {
            list.remove(0);
        }
        this.f60989a.put(str, acws);
    }

    /* renamed from: a */
    public final synchronized void mo33181a(PrintWriter printWriter, String str) {
        printWriter.println(str.concat("Context cache"));
        String concat = str.concat("  ");
        if (this.f60989a.isEmpty()) {
            printWriter.println(String.valueOf(concat).concat("<empty>"));
            return;
        }
        printWriter.println(String.valueOf(concat).concat("Keys:"));
        for (String str2 : this.f60989a.keySet()) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2 + String.valueOf(str2).length());
            sb.append(concat);
            sb.append("  ");
            sb.append(str2);
            printWriter.println(sb.toString());
        }
        if (Log.isLoggable("Icing", 2)) {
            printWriter.println(String.valueOf(concat).concat("Context:"));
            frd frd = new frd();
            frd.f17150a = true;
            frd.mo11189b();
            List b = m49910b(frd.mo11188a(), null);
            int i = 0;
            while (i < b.size()) {
                String valueOf = String.valueOf(b.get(i));
                StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 16 + String.valueOf(valueOf).length());
                sb2.append(concat);
                sb2.append("  #");
                i++;
                sb2.append(i);
                sb2.append(": ");
                sb2.append(valueOf);
                printWriter.println(sb2.toString());
            }
            return;
        }
        printWriter.println(String.valueOf(concat).concat("Context:<redacted>"));
    }
}
