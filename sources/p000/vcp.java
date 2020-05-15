package p000;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: vcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vcp {

    /* renamed from: a */
    private static final Map f49052a;

    static {
        HashMap hashMap = new HashMap();
        f49052a = hashMap;
        hashMap.put("HEADERS.AUTHORIZATION", 1);
        f49052a.put("HEADERS.IF-MATCH", 2);
        f49052a.put("HEADERS.IF-NONE-MATCH", 3);
        f49052a.put("PARAMETERS.ALT", 4);
        f49052a.put("PARAMETERS.Q", 5);
        f49052a.put("OTHER.PATH", 6);
        f49052a.put("PARAMETERS.ORDERBY", 7);
        f49052a.put("OTHER.REVISIONS", 8);
        f49052a.put("OTHER.REVISIONS.DELETE", 9);
        f49052a.put("OTHER.REVISIONS.LASTREVISION", 10);
        f49052a.put("PARAMETERS.CLIENTVERSION", 11);
        f49052a.put("PARAMETERS.ACKNOWLEDGEABUSE", 12);
        f49052a.put("OTHER.APP.CONFIGURATION", 13);
        f49052a.put("PARAMETERS.CONVERTTO", 14);
        f49052a.put("OTHER.EXPORT.SIZE", 15);
        f49052a.put("OTHER.FILE.OWNER", 16);
        f49052a.put("OTHER.FILE.EMBEDPARENTID", 17);
        f49052a.put("PARAMETERS.PARENTID", 18);
        f49052a.put("OTHER.FILE.TRASHED", 19);
        f49052a.put("OTHER.FILE", 20);
        f49052a.put("OTHER.FILE.ID", 21);
        f49052a.put("OTHER.PROPERTY.KEY", 22);
        f49052a.put("OTHER.USER.OPERATION.OCR", 23);
        f49052a.put("OTHER.SUBSCRIPTION", 24);
        f49052a.put("OTHER.USER.SHARING", 25);
        f49052a.put("OTHER.USER", 26);
        f49052a.put("OTHER.FILE.CONTENTTYPE", 27);
        f49052a.put("OTHER.FILE.INDEXABLETEXT", 28);
        f49052a.put("OTHER.FILE.SIZE", 29);
        f49052a.put("OTHER.PERMISSION.ID", 30);
        f49052a.put("OTHER.PERMISSION.KEY", 31);
        f49052a.put("OTHER.PERMISSION.ROLE", 32);
        f49052a.put("OTHER.PERMISSION.TYPE", 33);
        f49052a.put("OTHER.PERMISSION.VALUE", 34);
        f49052a.put("OTHER.PERMISSION.WITHLINK", 35);
        f49052a.put("OTHER.REVISION.ID", 36);
        f49052a.put("OTHER.SETTING.KEY", 37);
        f49052a.put("OTHER.SETTING.NAMESPACE", 38);
        f49052a.put("PARAMETERS.APPID", 39);
        f49052a.put("PARAMETERS.CHANGEID", 40);
        f49052a.put("PARAMETERS.CHILDID", 41);
        f49052a.put("PARAMETERS.EMAIL", 42);
        f49052a.put("PARAMETERS.FILEID", 43);
        f49052a.put("PARAMETERS.FOLDERID", 44);
        f49052a.put("PARAMETERS.MAXCHANGEIDCOUNT", 45);
        f49052a.put("PARAMETERS.MODIFIEDDATEBEHAVIOR", 46);
        f49052a.put("PARAMETERS.OCRLANGUAGE", 47);
        f49052a.put("PARAMETERS.PAGESELECTION.TOKEN", 48);
        f49052a.put("PARAMETERS.PERMISSIONID", 49);
        f49052a.put("PARAMETERS.PINNED", 50);
        f49052a.put("PARAMETERS.PROPERTYKEY", 51);
        f49052a.put("PARAMETERS.PROPERTYVISIBILITY", 52);
        f49052a.put("PARAMETERS.REVISIONID", 53);
        f49052a.put("PARAMETERS.SPACES", 54);
        f49052a.put("PARAMETERS.STARTCHANGEID", 55);
        f49052a.put("PARAMETERS.SPACE", 56);
        f49052a.put("OTHER.PROPERTY.SIZE", 57);
        f49052a.put("OTHER.PARENT.MIMETYPE", 58);
        f49052a.put("OTHER.PARENT.PERMISSIONS", 59);
        f49052a.put("OTHER.PARENT.PACKAGEID", 60);
        f49052a.put("OTHER.QUOTA.DOWNLOAD", 61);
        f49052a.put("OTHER.APP", 62);
        f49052a.put("OTHER.CHANGE", 63);
        f49052a.put("OTHER.CHILD", 64);
        f49052a.put("OTHER.PARENT", 65);
        f49052a.put("OTHER.PERMISSION", 66);
        f49052a.put("OTHER.PROPERTY", 67);
        f49052a.put("OTHER.REVISION", 68);
        f49052a.put("OTHER.CHILDLINK", 69);
        f49052a.put("OTHER.PARENTLINK", 70);
        f49052a.put("OTHER.SCOPES.APPFOLDER", 71);
        f49052a.put("OTHER.APPFOLDER.FILE.MIMETYPE", 72);
        f49052a.put("OTHER.APPFOLDER", 73);
        f49052a.put("OTHER.SCOPES.APPCONTENT", 74);
        f49052a.put("OTHER.APPCONTENT.FILE.MIMETYPE", 75);
        f49052a.put("OTHER.APPCONTENT", 76);
        f49052a.put("OTHER.SCOPES.APPS.READONLY", 77);
        f49052a.put("OTHER.FILE.FLAGGEDFORABUSE", 78);
        f49052a.put("OTHER.FILE.IMMUTABLE", 79);
        f49052a.put("OTHER.FILE.MIMETYPE", 80);
        f49052a.put("OTHER.OPERATION.OCR", 81);
        f49052a.put("OTHER.FILE.PERMISSIONS", 82);
        f49052a.put("OTHER.PROPERTIES.COUNT", 83);
        f49052a.put("OTHER.PROPERTY.VISIBILITY", 84);
        f49052a.put("OTHER.REVISION.PUBLISHED", 85);
        f49052a.put("OTHER.APP.FORCEINSTALLED", 86);
        f49052a.put("OTHER.SCOPES", 87);
        f49052a.put("OTHER.SCOPES.SCRIPT", 88);
        f49052a.put("OTHER.FILE.LABELS.RESTRICTED", 89);
        f49052a.put("OTHER.APPS.ALL_WEBSTORE", 90);
        f49052a.put("OTHER.FILE.LOCALID", 91);
        f49052a.put("PARAMETERS.FIELDS", 92);
        f49052a.put("PARAMETERS.SECONDARYSORTBY", 93);
        f49052a.put("OTHER.SETTING", 94);
        f49052a.put("PARAMETERS.SETTINGNAMESPACE", 95);
        f49052a.put("OTHER.SCOPES.ALL_APPDATA", 96);
        f49052a.put("OTHER.FILE.CREATED_MILLIS", 97);
        f49052a.put("OTHER.PERMISSION.EXPIRATIONDATE", 98);
        f49052a.put("PARAMETERS.TEAMDRIVEID", 99);
        f49052a.put("PARAMETERS.CORPORA", 100);
        f49052a.put("PARAMETERS.CORPUS", 101);
        f49052a.put("PARAMETERS.PRECONDITION", 102);
    }

    /* renamed from: a */
    public static Integer m39996a(String str) {
        if (str != null) {
            return (Integer) f49052a.get(str.toUpperCase(Locale.US));
        }
        return null;
    }
}
