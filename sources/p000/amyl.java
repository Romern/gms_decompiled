package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyl {

    /* renamed from: c */
    public static final bnic f76386c = bnic.m109494a("vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/group_membership", "vnd.android.cursor.item/identity", "vnd.android.cursor.item/im", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/note", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/photo", "vnd.android.cursor.item/relation", "vnd.android.cursor.item/sip_address", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/website", "vnd.android.cursor.item/name", "vnd.com.google.cursor.item/contact_calendar_link", "vnd.com.google.cursor.item/contact_extended_property", "vnd.com.google.cursor.item/contact_external_id", "vnd.com.google.cursor.item/contact_hobby", "vnd.com.google.cursor.item/contact_jot", "vnd.com.google.cursor.item/contact_language", "vnd.com.google.cursor.item/contact_misc", "vnd.com.google.cursor.item/contact_user_defined_field", "vnd.com.google.cursor.item/contact_file_as");

    /* renamed from: a */
    public final ContentResolver f76387a;

    /* renamed from: b */
    public final Account f76388b;

    public amyl(ContentResolver contentResolver, Account account) {
        this.f76387a = contentResolver;
        this.f76388b = account;
    }

    /* renamed from: a */
    public static List m63726a(amvw amvw, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            amvp a = amvw.mo41464b();
            if (a == null) {
                return arrayList;
            }
            if (!z || !a.f76102k) {
                List list = a.f76081A;
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    sb.append(((ContentValues) list.get(i)).get("data1"));
                }
                String sb2 = sb.toString();
                if (!sb2.isEmpty()) {
                    arrayList.add(new amyx(a, sb2));
                }
            }
        }
    }
}
