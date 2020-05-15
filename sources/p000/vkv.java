package p000;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.drive.internal.model.ChangeList;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileList;
import com.google.android.gms.drive.internal.model.FileLocalId;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: vkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkv {

    /* renamed from: a */
    public static final sbw f49412a = new sbw("ApiaryRemoteResourceAcc", "");

    /* renamed from: b */
    public static final String f49413b = String.format("mimeType = '%s'", "application/vnd.google-apps.folder");

    /* renamed from: c */
    public static final String f49414c = String.format("mimeType != '%s'", "application/vnd.google-apps.folder");

    /* renamed from: d */
    private static final Map f49415d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final bnic f49416e = bnic.m109494a("authorizedAppIds", "creatorAppId", "subscribed", "gplusMedia", "folderFeatures", "spaces", "recency", "recencyReason", "appId");

    /* renamed from: f */
    private static final bnic f49417f = bnic.m109490a(FileList.class, ChangeList.class);

    /* renamed from: g */
    private vla f49418g;

    /* renamed from: h */
    private vla f49419h;

    /* renamed from: i */
    private final Context f49420i;

    static {
        sdo.m34959a((Object) "application/vnd.google-apps.folder");
        sdo.m34959a((Object) "application/vnd.google-apps.folder");
    }

    public vkv(Context context) {
        this.f49420i = context;
    }

    /* renamed from: a */
    public static FileLocalId m40739a(String str, boolean z) {
        String str2;
        FileLocalId fileLocalId = new FileLocalId();
        fileLocalId.f31029c = str;
        fileLocalId.f31027a.add(4);
        if (!z) {
            str2 = "DRIVE";
        } else {
            str2 = "APPDATA";
        }
        fileLocalId.f31028b = str2;
        fileLocalId.f31027a.add(3);
        String str3 = (String) twy.f46817aA.mo58455c();
        if (!TextUtils.isEmpty(str3)) {
            fileLocalId.f31030d = str3;
            fileLocalId.f31027a.add(5);
        }
        return fileLocalId;
    }

    /* renamed from: a */
    public static boolean m40743a(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        return networkResponse != null && networkResponse.statusCode == 404;
    }

    /* renamed from: b */
    private static String m40745b(Class cls, boolean z, boolean z2) {
        vku vku = new vku(cls, z, z2);
        String str = (String) f49415d.get(vku);
        if (str != null) {
            return str;
        }
        String a = m40741a(cls, z, z2);
        f49415d.put(vku, a);
        return a;
    }

    /* renamed from: a */
    public static String m40740a(Class cls, boolean z) {
        return m40745b(cls, z, f49417f.contains(cls));
    }

    /* renamed from: a */
    private static String m40741a(Class cls, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : ((sio) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).mo7367a().entrySet()) {
                if (z || !f49416e.contains(entry.getKey())) {
                    if (z2 || !((Boolean) twy.f46807R.mo58455c()).booleanValue()) {
                        if ("permissions".equals(entry.getKey())) {
                        }
                    }
                    if (((Boolean) twy.f46803N.mo58455c()).booleanValue() || !"folderColorRgb".equals(entry.getKey())) {
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append((String) entry.getKey());
                        Class cls2 = ((FastJsonResponse$Field) entry.getValue()).f30320h;
                        if (cls2 != null) {
                            String b = m40745b(cls2, z, z2);
                            if (b.length() != 0) {
                                sb.append("(");
                                sb.append(b);
                                sb.append(")");
                            }
                        }
                    }
                }
            }
        } catch (NoSuchMethodException e) {
            f49412a.mo25378c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", cls), e);
        } catch (InstantiationException e2) {
            f49412a.mo25378c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", cls), e2);
        } catch (IllegalAccessException e3) {
            f49412a.mo25378c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", cls), e3);
        } catch (InvocationTargetException e4) {
            f49412a.mo25378c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", cls), e4);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static vla m40742a(Context context, String str, int i) {
        String a = vkx.m40756a();
        vla vla = new vla(context, (String) twy.f46800K.mo58455c(), str, ((Boolean) twy.f46873bd.mo58455c()).booleanValue(), a, i);
        if (a != null && ((Boolean) twy.f46801L.mo58455c()).booleanValue()) {
            vla.f44446f.put("trace.deb", "genoa:3:all,driveService:3:all,cospel:3:all,DriveService:3:all");
        }
        return vla;
    }

    /* renamed from: a */
    public static boolean m40744a(ClientContext clientContext) {
        return "com.google.android.gms".equals(clientContext.f30216f);
    }

    /* renamed from: a */
    public final String mo28597a(ClientContext clientContext, String str, boolean z) {
        File file = new File();
        file.mo18240a(m40739a(str, z));
        vld vld = new vld(mo28605a(clientContext, 2839));
        shc shc = new shc();
        shc.mo25530a("id");
        try {
            StringBuilder sb = new StringBuilder("files/generateId");
            shc.mo25531a(sb);
            return ((File) vld.f49433a.mo25536a(clientContext, 1, sb.toString(), file, File.class)).f31002t;
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final String mo28598a(Set set) {
        sdo.m34959a(set);
        if (!set.isEmpty()) {
            return TextUtils.join(",", set.toArray());
        }
        return null;
    }

    /* renamed from: a */
    public final String mo28599a(uey uey) {
        ClientContext a = uey.mo27262a(this.f49420i);
        vld vld = new vld(mo28605a(a, 2822));
        try {
            shc shc = new shc();
            shc.mo25530a("id");
            return vld.mo28610a(a, "appdata", false, true, null, null, null, null, null, null, false, shc).f31002t;
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final vkr mo28600a(ClientContext clientContext, File file) {
        vld vld = new vld(mo28605a(clientContext, 2829));
        shc shc = new shc();
        shc.mo25530a(m40740a(File.class, m40744a(clientContext)));
        StringBuilder sb = new StringBuilder("files");
        shc.mo25531a(sb);
        shd.m35269a(sb, "convert", String.valueOf((Object) false));
        shd.m35269a(sb, "ocr", String.valueOf((Object) false));
        shd.m35269a(sb, "pinned", String.valueOf((Object) false));
        shd.m35269a(sb, "useContentAsIndexableText", String.valueOf((Object) false));
        return new vkt((File) vld.f49433a.mo25536a(clientContext, 1, sb.toString(), file, File.class), clientContext, null);
    }

    /* renamed from: a */
    public final vkr mo28601a(ClientContext clientContext, String str, MetadataBundle metadataBundle) {
        ClientContext clientContext2 = clientContext;
        vld vld = new vld(mo28605a(clientContext2, 2837));
        try {
            shc shc = new shc();
            shc.mo25530a(m40740a(File.class, m40744a(clientContext)));
            return new vkt(vld.mo28611a(clientContext, str, false, null, "SET_FROM_BODY", null, false, false, null, false, null, true, null, false, false, uyj.m39758a(metadataBundle), shc), clientContext2, null);
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final vkr mo28602a(ClientContext clientContext, String str, Set set, vks vks) {
        vks vks2;
        ClientContext clientContext2 = clientContext;
        vla a = mo28605a(clientContext2, 2827);
        if (m40744a(clientContext)) {
            vks2 = vks;
        } else {
            vks2 = vks.f49399a;
        }
        vld vld = new vld(a);
        shc shc = new shc();
        shc.mo25530a(m40740a(File.class, m40744a(clientContext)));
        try {
            return new vkt(vld.mo28610a(clientContext, str, false, true, vks2.f49403e, mo28598a(set), vks2.f49402d, vks2.f49401c, vks2.mo28592a(), vks2.f49400b, false, shc), clientContext2, null);
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final vkw mo28603a(ClientContext clientContext, String str, String str2, String str3, String str4, String str5, boolean z, vbo vbo, vks vks, int i) {
        vks vks2;
        sdo.m34959a(vbo);
        vla a = mo28605a(clientContext, i);
        if (!m40744a(clientContext)) {
            vks2 = vks.f49399a;
        } else {
            vks2 = vks;
        }
        try {
            shc shc = new shc();
            shc.mo25530a(m40740a(FileList.class, m40744a(clientContext)));
            Boolean bool = vks2.f49403e;
            Boolean bool2 = vks2.f49402d;
            Boolean bool3 = vks2.f49401c;
            String a2 = vks2.mo28592a();
            Integer num = vks2.f49400b;
            StringBuilder sb = new StringBuilder("files");
            shc.mo25531a(sb);
            shd.m35269a(sb, "allProperties", String.valueOf((Object) true));
            if (bool != null) {
                shd.m35269a(sb, "errorRecovery", String.valueOf(bool));
            }
            if (str != null) {
                shd.m35269a(sb, "fileScopeAppIds", shd.m35267a(str));
            }
            shd.m35269a(sb, "maxResults", String.valueOf((Object) 100));
            if (bool2 != null) {
                shd.m35269a(sb, "mutationPrecondition", String.valueOf(bool2));
            }
            if (bool3 != null) {
                shd.m35269a(sb, "openDrive", String.valueOf(bool3));
            }
            if (str5 != null) {
                shd.m35269a(sb, "orderBy", shd.m35267a(str5));
            }
            if (str2 != null) {
                shd.m35269a(sb, "pageToken", shd.m35267a(str2));
            }
            if (str3 != null) {
                shd.m35269a(sb, "q", shd.m35267a(str3));
            }
            if (a2 != null) {
                shd.m35269a(sb, "reason", shd.m35267a(a2));
            }
            if (str4 != null) {
                shd.m35269a(sb, "spaces", shd.m35267a(str4));
            }
            if (num != null) {
                shd.m35269a(sb, "syncType", String.valueOf(num));
            }
            FileList fileList = (FileList) a.mo28608a(clientContext, sb.toString(), FileList.class, z, vbo);
            sdo.m34959a(fileList);
            ArrayList arrayList = new ArrayList();
            for (File file : fileList.f31024b) {
                arrayList.add(new vkt(file, clientContext, null));
            }
            return new vkw(arrayList, fileList.f31025c, null);
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final vkw mo28604a(ClientContext clientContext, Set set, String str, String str2, String str3, String str4, boolean z, vbo vbo, vks vks) {
        return mo28603a(clientContext, mo28598a(set), str, str2, str3, str4, z, vbo, vks, 2825);
    }

    /* renamed from: a */
    public final vla mo28605a(ClientContext clientContext, int i) {
        if (this.f49418g == null) {
            this.f49418g = m40742a(this.f49420i, "/drive/v2beta/", i);
        }
        if (this.f49419h == null) {
            this.f49419h = m40742a(this.f49420i, vkx.m40758b(), i);
        }
        return m40744a(clientContext) ? this.f49419h : this.f49418g;
    }

    /* renamed from: a */
    public final void mo28606a(int i, Permission permission) {
        if (i == 0) {
            permission.mo18250e("reader");
        } else if (i == 1) {
            permission.mo18250e("reader");
            if (permission.f31037b == null) {
                permission.f31037b = new ArrayList();
            }
            permission.f31037b.add("commenter");
            permission.f31036a.add(2);
        } else if (i == 2) {
            permission.mo18250e("writer");
        } else if (i == 3) {
            permission.mo18250e("owner");
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Invalid role value:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
