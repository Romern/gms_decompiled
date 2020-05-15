package p000;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: aotd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aotd extends BaseColumns {

    /* renamed from: a */
    public static final Uri f83574a = Uri.withAppendedPath(aote.f83580a, "reminders");

    /* renamed from: b */
    public static final Uri f83575b = Uri.withAppendedPath(aote.f83580a, "reminders/upsert");

    /* renamed from: c */
    public static final Uri f83576c = Uri.withAppendedPath(aote.f83580a, "reminders/refresh_due_date");

    /* renamed from: d */
    public static final Uri f83577d = Uri.withAppendedPath(aote.f83580a, "reminders/mark_exceptional");

    /* renamed from: e */
    public static final Uri f83578e = Uri.withAppendedPath(aote.f83580a, "reminders/update_fired");

    /* renamed from: f */
    public static final Uri f83579f = Uri.withAppendedPath(aote.f83580a, "reminders/update_bumped");
}
