package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.Iterator;
import java.util.List;

/* renamed from: akip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akip {
    /* renamed from: a */
    public static int m59836a(ShareTarget shareTarget) {
        int i;
        List b = shareTarget.mo44499b();
        int i2 = 0;
        if (!b.isEmpty()) {
            i = ((Attachment) b.get(0)).mo44388f();
            int size = b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                int i4 = i3 + 1;
                if (i != ((Attachment) b.get(i3)).mo44388f()) {
                    i = 1;
                    break;
                }
                i3 = i4;
            }
        } else {
            i = 1;
        }
        int i5 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i5 == 1) {
            List list = shareTarget.f81034g;
            if (!list.isEmpty()) {
                int i6 = ((FileAttachment) list.get(0)).f80882b;
                if (!bnjd.m109599f(list, new akin(i6)).mo66813a()) {
                    i2 = i6;
                }
            }
            if (i2 == 0) {
                return C0126R.plurals.sharing_file_types_default;
            }
            if (i2 == 1) {
                return C0126R.plurals.sharing_file_types_images;
            }
            if (i2 != 2) {
                return i2 != 3 ? C0126R.plurals.sharing_attachment_default : C0126R.plurals.sharing_file_types_apps;
            }
            return C0126R.plurals.sharing_file_types_videos;
        } else if (i5 != 2) {
            return C0126R.plurals.sharing_attachment_default;
        } else {
            List list2 = shareTarget.f81033f;
            if (!list2.isEmpty()) {
                int i7 = ((TextAttachment) list2.get(0)).f81049b;
                if (!bnjd.m109599f(list2, new akio(i7)).mo66813a()) {
                    i2 = i7;
                }
            }
            if (i2 == 0) {
                return C0126R.plurals.sharing_text_types_default;
            }
            if (i2 == 1) {
                return C0126R.plurals.sharing_text_types_links;
            }
            if (i2 == 2) {
                return C0126R.plurals.sharing_text_types_addresses;
            }
            if (i2 != 3) {
                return C0126R.plurals.sharing_attachment_default;
            }
            return C0126R.plurals.sharing_text_types_phone_numbers;
        }
    }

    /* renamed from: b */
    public static Drawable m59842b(Context context, List list) {
        if (list.isEmpty()) {
            return null;
        }
        if (((Attachment) list.get(0)).mo44387e()) {
            return context.getDrawable(C0126R.C0127drawable.quantum_gm_ic_wifi_vd_theme_24);
        }
        if (!m59841a(list)) {
            Attachment attachment = (Attachment) list.get(0);
            if (!attachment.mo44386d() || attachment.mo44384b() != 1) {
                return context.getDrawable(C0126R.C0127drawable.quantum_gm_ic_short_text_vd_theme_24);
            }
            return context.getDrawable(C0126R.C0127drawable.quantum_gm_ic_link_vd_theme_24);
        } else if (list.size() > 1) {
            return context.getDrawable(C0126R.C0127drawable.quantum_gm_ic_file_copy_vd_theme_24);
        } else {
            return context.getDrawable(C0126R.C0127drawable.quantum_gm_ic_insert_drive_file_vd_theme_24);
        }
    }

    /* renamed from: a */
    public static CharSequence m59837a(Context context, ShareTarget shareTarget) {
        int a = m59836a(shareTarget);
        int size = shareTarget.mo44499b().size();
        C1416ut utVar = (C1416ut) context;
        String quantityString = utVar.mo16091a().getQuantityString(a, size);
        return utVar.mo16091a().getString(C0126R.string.sharing_notification_incoming_in_progress_file, Integer.valueOf(size), quantityString);
    }

    /* renamed from: a */
    public static CharSequence m59838a(Context context, ShareTarget shareTarget, CharSequence charSequence) {
        return String.format("%s. %s", m59837a(context, shareTarget), ((C1416ut) context).mo16091a().getString(C0126R.string.sharing_notification_confirm_token, charSequence));
    }

    /* renamed from: a */
    public static CharSequence m59839a(Context context, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return ((C1416ut) context).mo16091a().getString(C0126R.string.sharing_notification_outgoing_waiting_description);
        }
        return ((C1416ut) context).mo16091a().getString(C0126R.string.sharing_notification_confirm_token, charSequence);
    }

    /* renamed from: a */
    public static String m59840a(Context context, List list) {
        int i;
        if (list.isEmpty()) {
            return null;
        }
        if (m59841a(list)) {
            String str = ((FileAttachment) list.get(0)).f80881a;
            if (list.size() == 1) {
                return str;
            }
            Resources resources = context.getResources();
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(list.size() - 1);
            Resources resources2 = context.getResources();
            if (!akhv.m59742a(list, 1)) {
                i = !akhv.m59742a(list, new int[]{2}) ? C0126R.plurals.sharing_file_types_default : C0126R.plurals.sharing_file_types_videos;
            } else {
                i = C0126R.plurals.sharing_file_types_images;
            }
            objArr[2] = resources2.getQuantityString(i, list.size() - 1);
            return resources.getString(C0126R.string.sharing_share_sheet_content_preview, objArr);
        } else if (((Attachment) list.get(0)).mo44387e()) {
            return ((WifiCredentialsAttachment) list.get(0)).f81057a;
        } else {
            return ((TextAttachment) list.get(0)).f81048a;
        }
    }

    /* renamed from: a */
    public static boolean m59841a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Attachment) it.next()).mo44388f() != 2) {
                return false;
            }
        }
        return true;
    }
}
