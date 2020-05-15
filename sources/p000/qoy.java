package p000;

import java.util.Locale;

/* renamed from: qoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoy {
    /* renamed from: a */
    public static String m32605a(qov qov) {
        String str;
        String str2;
        int size = qov.f41902d.size();
        if (size <= 0) {
            return "No status updates.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Last ");
        sb.append(size);
        sb.append(" status update");
        if (size <= 1) {
            str = "";
        } else {
            str = "s";
        }
        sb.append(str);
        sb.append(" (Number, Description):\n\n");
        int i = 0;
        while (i < size) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            i++;
            objArr[0] = Integer.valueOf(i);
            int a = qot.m32591a(((qou) qov.f41902d.get(i)).f41896b);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 0:
                    str2 = "Unknown";
                    break;
                case 1:
                    str2 = "Accepted";
                    break;
                case 2:
                    str2 = "OfferedByServer";
                    break;
                case 3:
                    str2 = "ModuleSetMergeError";
                    break;
                case 4:
                    str2 = "OverriddenByNewerVersion";
                    break;
                case 5:
                    str2 = "ModuleSetBlacklisted";
                    break;
                case 6:
                    str2 = "ZappDownloadFailed";
                    break;
                case 7:
                    str2 = "ConfigResolutionAttempted";
                    break;
                case 8:
                    str2 = "Unavailable";
                    break;
                case 9:
                    str2 = "ConfigResolutionRejected";
                    break;
                case 10:
                    str2 = "IncorrectLocalTargeting";
                    break;
                case 11:
                    str2 = "TooManyModuleSetInfos";
                    break;
                case 12:
                    str2 = "NoLongerOfferedByServer";
                    break;
                case 13:
                    str2 = "NoEnabledFeaturesOrApks";
                    break;
                case 14:
                    str2 = "UnsupportedTargetingType";
                    break;
                default:
                    str2 = "NotDownloadedMeteredNetwork";
                    break;
            }
            objArr[1] = str2;
            sb.append(String.format(locale, "%2d) %25s \n", objArr));
        }
        return sb.toString();
    }
}
