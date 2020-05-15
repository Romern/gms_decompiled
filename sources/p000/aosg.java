package p000;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aosg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aosg extends AsyncTask {

    /* renamed from: a */
    private final Context f83504a;

    /* renamed from: b */
    private final Account[] f83505b;

    public aosg(Context context, Account[] accountArr) {
        this.f83504a = context;
        this.f83505b = accountArr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        List a = aosf.m69446a(this.f83504a, null, null);
        Account[] accountArr = this.f83505b;
        for (Account account : accountArr) {
            if (aosf.m69448a(account)) {
                String str = account.name;
                int size = a.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        int i2 = i + 1;
                        if (((aosi) a.get(i)).f83508b.name.equalsIgnoreCase(str)) {
                            break;
                        }
                        i = i2;
                    } else {
                        new Object[1][0] = account.name;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("account_name", account.name);
                        contentValues.put("morning_customized_time", Long.valueOf(((long) ((Integer) aoss.f83553l.mo58455c()).intValue()) * 3600000));
                        contentValues.put("afternoon_customized_time", Long.valueOf(((long) ((Integer) aoss.f83554m.mo58455c()).intValue()) * 3600000));
                        contentValues.put("evening_customized_time", Long.valueOf(((long) ((Integer) aoss.f83555n.mo58455c()).intValue()) * 3600000));
                        this.f83504a.getContentResolver().insert(aosy.f83568a, contentValues);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("initialize", true);
                        ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
                        break;
                    }
                }
            }
        }
        int size2 = a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            aosi aosi = (aosi) a.get(i3);
            Account[] accountArr2 = this.f83505b;
            String str2 = aosi.f83508b.name;
            int length = accountArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (str2.equalsIgnoreCase(accountArr2[i4].name)) {
                        break;
                    }
                    i4++;
                } else {
                    Context context = this.f83504a;
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = {String.valueOf(aosi.f83507a)};
                    arrayList.add(ContentProviderOperation.newDelete(aotd.f83574a).withSelection("account_id=?", strArr).build());
                    arrayList.add(ContentProviderOperation.newDelete(aota.f83571a).withSelection("account_id=?", strArr).build());
                    arrayList.add(ContentProviderOperation.newDelete(aotb.f83572a).withSelection("account_id=?", strArr).build());
                    arrayList.add(ContentProviderOperation.newDelete(aosy.f83568a).withSelection("_id=?", strArr).build());
                    sgq.m35236a(context.getContentResolver(), arrayList, "RemindersAccount");
                    break;
                }
            }
        }
        return null;
    }
}
