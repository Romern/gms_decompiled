package p000;

import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.data.RegistrationEntity;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.ArrayList;

/* renamed from: azfh */
public final /* synthetic */ class azfh implements Runnable {

    /* renamed from: a */
    private final MessagingService f99225a;

    public azfh(MessagingService messagingService) {
        this.f99225a = messagingService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    public final void run() {
        MessagingService messagingService = this.f99225a;
        azcv a = azcv.m85357a(messagingService.f111093m);
        ArrayList arrayList = new ArrayList();
        if (cfec.m138765b()) {
            azdl.m85412a(a.f99016a);
            if (azdl.m85420h(a.f99016a)) {
                a.mo54694a(arrayList);
            }
        } else {
            a.mo54694a(arrayList);
        }
        azcm a2 = azcm.m85300a(a.f99016a);
        if (!a2.mo54651a()) {
            a2.f98996b = azcl.m85289a(a2.f98995a).getReadableDatabase();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        a2.f98996b.beginTransaction();
        Cursor cursor = null;
        RegistrationEntity registrationEntity = null;
        try {
            Cursor rawQuery = a2.f98996b.rawQuery(azcm.f98991d, null);
            try {
                new Object[1][0] = azcm.f98991d;
                if (rawQuery == null || !rawQuery.moveToFirst()) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    a2.f98996b.endTransaction();
                } else {
                    do {
                        LocalEntityId localEntityId = new LocalEntityId(rawQuery.getString(rawQuery.getColumnIndex("id")), rawQuery.getInt(rawQuery.getColumnIndex("type")), rawQuery.getString(rawQuery.getColumnIndex("app_id")));
                        if (localEntityId.f111075b != 1) {
                            arrayList2.add(localEntityId);
                        } else if (!arrayList2.isEmpty()) {
                            String string = rawQuery.getString(rawQuery.getColumnIndex("registration_id"));
                            rawQuery.moveToPrevious();
                            if (!TextUtils.equals(string, rawQuery.getString(rawQuery.getColumnIndex("registration_id")))) {
                                arrayList3.add(localEntityId);
                            } else {
                                arrayList2.add(localEntityId);
                            }
                            rawQuery.moveToNext();
                        } else {
                            arrayList3.add(localEntityId);
                        }
                    } while (rawQuery.moveToNext());
                    a2.f98996b.setTransactionSuccessful();
                    rawQuery.close();
                    a2.f98996b.endTransaction();
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        RegistrationEntity registrationEntity2 = new RegistrationEntity();
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add((LocalEntityId) arrayList3.get(i));
                        registrationEntity2.f111078b = arrayList4;
                        arrayList.add(registrationEntity2);
                    }
                    int size2 = arrayList2.size();
                    ArrayList arrayList5 = null;
                    for (int i2 = 0; i2 < size2; i2++) {
                        LocalEntityId localEntityId2 = (LocalEntityId) arrayList2.get(i2);
                        if (localEntityId2.f111075b != 7) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(localEntityId2);
                        } else {
                            if (registrationEntity != null) {
                                registrationEntity.f111078b = arrayList5;
                                arrayList.add(registrationEntity);
                            }
                            RegistrationEntity registrationEntity3 = new RegistrationEntity();
                            registrationEntity3.f111077a = localEntityId2;
                            registrationEntity = registrationEntity3;
                            arrayList5 = new ArrayList();
                        }
                    }
                    if (registrationEntity != null) {
                        registrationEntity.f111078b = arrayList5;
                        arrayList.add(registrationEntity);
                    }
                }
                Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.settings_account_populate");
                intent.setPackage(messagingService.f111093m.getPackageName());
                intent.putParcelableArrayListExtra("all_accounts_extra", arrayList);
                messagingService.f111093m.sendBroadcast(intent);
            } catch (Throwable th) {
                th = th;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                a2.f98996b.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            a2.f98996b.endTransaction();
            throw th;
        }
    }
}
