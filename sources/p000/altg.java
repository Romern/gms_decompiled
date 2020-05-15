package p000;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: altg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altg {
    static {
        bngx.m109357a("email_gaia_map", "facl_application");
    }

    /* renamed from: a */
    public static bnhe m61755a() {
        String a = alth.m61761a("owners", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "account_name TEXT NOT NULL", "gaia_id TEXT", "page_gaia_id TEXT", "display_name TEXT", "avatar TEXT", "cover_photo_url TEXT", "cover_photo_height INTEGER NOT NULL DEFAULT 0", "cover_photo_width INTEGER NOT NULL DEFAULT 0", "cover_photo_id TEXT", "last_sync_start_time INTEGER NOT NULL DEFAULT 0", "last_sync_finish_time INTEGER NOT NULL DEFAULT 0", "last_sync_status INTEGER NOT NULL DEFAULT 0", "last_successful_sync_time INTEGER NOT NULL DEFAULT 0", "sync_to_contacts INTEGER NOT NULL DEFAULT 0", "is_dasher INTEGER NOT NULL DEFAULT 0", "dasher_domain TEXT", "etag TEXT", "sync_circles_to_contacts INTEGER NOT NULL DEFAULT 0", "sync_evergreen_to_contacts INTEGER NOT NULL DEFAULT 0", "last_full_people_sync_time INTEGER NOT NULL DEFAULT 0", "is_active_plus_account INTEGER NOT NULL DEFAULT 0", "sync_me_to_contacts INTEGER NOT NULL DEFAULT 0", "given_name TEXT", "family_name TEXT", "contacts_backup_and_sync INTEGER NOT NULL DEFAULT 0");
        String a2 = alth.m61761a("owner_sync_requests", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "account_name TEXT NOT NULL", "page_gaia_id TEXT", "sync_requested_time INTEGER NOT NULL DEFAULT 0", alth.m61763a("account_name", "page_gaia_id"));
        String a3 = alth.m61761a("people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "gaia_id TEXT", "v2_id TEXT NOT NULL", "name TEXT", "given_name TEXT", "family_name TEXT", "middle_name TEXT", "name_verified INTEGER NOT NULL DEFAULT 0", "profile_type INTEGER NOT NULL", "sort_key TEXT", "sort_key_last_name TEXT", "sort_key_irank TEXT", "avatar TEXT", "tagline TEXT", "blocked INTEGER NOT NULL DEFAULT 0", "etag TEXT", "last_modified INTEGER NOT NULL DEFAULT 0", "invisible_3p INTEGER NOT NULL DEFAULT 0", "in_viewer_domain INTEGER NOT NULL DEFAULT 0", "in_circle INTEGER NOT NULL DEFAULT 0", "in_contacts INTEGER NOT NULL DEFAULT 0", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "people_in_common TEXT", "sync_is_alive INTEGER NOT NULL DEFAULT 0", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", "mobile_owner_id TEXT", "name_visibility TEXT DEFAULT 'public'", "avatar_visibility TEXT DEFAULT 'public'", alth.m61763a("owner_id", "qualified_id"), alth.m61759a("owner_id", "owners", "_id"));
        String a4 = alth.m61761a("sync_tokens", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "name TEXT NOT NULL", "value TEXT NOT NULL", alth.m61763a("owner_id", "name"), alth.m61759a("owner_id", "owners", "_id"));
        String a5 = alth.m61761a("circles", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "circle_id TEXT NOT NULL", "name TEXT", "sort_key TEXT", "type INTEGER NOT NULL", "for_sharing INTEGER NOT NULL DEFAULT 0", "people_count INTEGER NOT NULL DEFAULT -1", "client_policies INTEGER NOT NULL DEFAULT 0", "etag TEXT", "last_modified INTEGER NOT NULL DEFAULT 0", "sync_to_contacts INTEGER NOT NULL DEFAULT 0", alth.m61763a("owner_id", "circle_id"), alth.m61759a("owner_id", "owners", "_id"));
        String a6 = alth.m61761a("emails", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "email TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1));
        String a7 = alth.m61761a("phones", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "phone TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1));
        String a8 = alth.m61761a("postal_address", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "postal_address TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1));
        String a9 = alth.m61761a("owner_emails", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "email TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61759a("owner_id", "owners", "_id"));
        String a10 = alth.m61761a("owner_phones", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "phone TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61759a("owner_id", "owners", "_id"));
        String a11 = alth.m61761a("owner_postal_address", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "postal_address TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", alth.m61759a("owner_id", "owners", "_id"));
        sdo.m34975b(true, "Must have at least one key.");
        String a12 = alth.m61761a("circle_members", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "circle_id TEXT NOT NULL", String.format("PRIMARY KEY (%s)", TextUtils.join(",", new String[]{"owner_id", "qualified_id", "circle_id"})), alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1), alth.m61762a(bngx.m109357a("owner_id", "circle_id"), "circles", bngx.m109357a("owner_id", "circle_id"), 1));
        String a13 = alth.m61761a("gaia_id_map", "owner_id INTEGER NOT NULL", "contact_id TEXT NOT NULL", "value TEXT NOT NULL", "gaia_id TEXT NOT NULL", "type INTEGER NOT NULL", alth.m61763a("owner_id", "contact_id", "value"), alth.m61759a("owner_id", "owners", "_id"));
        String a14 = alth.m61761a("applications", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", alth.m61763a("owner_id", "dev_console_id"), alth.m61759a("owner_id", "owners", "_id"));
        String a15 = alth.m61761a("application_packages", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "package_name TEXT NOT NULL", "certificate_hash TEXT NOT NULL", alth.m61762a(bngx.m109357a("owner_id", "dev_console_id"), "applications", bngx.m109357a("owner_id", "dev_console_id"), 1));
        String a16 = alth.m61761a("facl_people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "qualified_id TEXT NOT NULL", alth.m61766b("owner_id", "dev_console_id", "qualified_id"), alth.m61762a(bngx.m109357a("owner_id", "qualified_id"), "people", bngx.m109357a("owner_id", "qualified_id"), 1), alth.m61762a(bngx.m109357a("owner_id", "dev_console_id"), "applications", bngx.m109357a("owner_id", "dev_console_id"), 1));
        String a17 = alth.m61761a("ac_people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "people_v2_id TEXT NOT NULL", "qualified_id TEXT", "sync_is_alive INTEGER NOT NULL DEFAULT 0", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", "last_update_time INTEGER NOT NULL DEFAULT 0", alth.m61763a("owner_id", "people_v2_id"), alth.m61759a("owner_id", "owners", "_id"));
        String a18 = alth.m61761a("ac_container", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "people_id INTEGER NOT NULL", "container_type INTEGER NOT NULL", "profile_type INTEGER NOT NULL", "gaia_id TEXT", "contact_id TEXT", "compressed_avatar_url TEXT", "has_avatar INTEGER NOT NULL DEFAULT 0", "in_circle INTEGER NOT NULL DEFAULT 0", "in_viewer_domain INTEGER NOT NULL DEFAULT 0", "display_name TEXT", "formatted_name TEXT", "given_name TEXT", "family_name TEXT", "middle_name TEXT", "honorific_prefix TEXT", "honorific_suffix TEXT", "yomi_given_name TEXT", "yomi_family_name TEXT", "yomi_honorific_prefix TEXT", "yomi_honorific_suffix TEXT", "nickname TEXT", alth.m61759a("people_id", "ac_people", "_id"));
        String a19 = alth.m61761a("ac_item", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "container_id INTEGER NOT NULL", "item_type INTEGER NOT NULL", "is_edge_key INTEGER", "value TEXT NOT NULL", "value2 TEXT", "value_type INTEGER", "custom_label TEXT", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", "certificate_expiration_millis INTEGER NOT NULL DEFAULT 0", "certificate_status TEXT", alth.m61759a("container_id", "ac_container", "_id"));
        String a20 = alth.m61761a("search_index", "person_id INTEGER NOT NULL", "kind INTEGER NOT NULL", "value TEXT NOT NULL", alth.m61759a("person_id", "people", "_id"));
        String a21 = alth.m61761a("ac_index", "item_id INTEGER NOT NULL", "owner_id INTEGER NOT NULL", "is_normalized INTEGER NOT NULL", "kind INTEGER NOT NULL", "value TEXT NOT NULL COLLATE NOCASE", alth.m61759a("owner_id", "owners", "_id"), alth.m61759a("item_id", "ac_item", "_id"));
        String a22 = alth.m61761a("properties", "name TEXT NOT NULL PRIMARY KEY", "value TEXT");
        String a23 = alth.m61761a("temp_gaia_ordinal", "ordinal INTEGER NOT NULL", "gaia_id TEXT NULL", "qualified_id TEXT NOT NULL");
        bnha h = bnhe.m109414h();
        h.mo67695b("owners", a);
        h.mo67695b("owner_sync_requests", a2);
        h.mo67695b("people", a3);
        h.mo67695b("sync_tokens", a4);
        h.mo67695b("circles", a5);
        h.mo67695b("emails", a6);
        h.mo67695b("phones", a7);
        h.mo67695b("postal_address", a8);
        h.mo67695b("owner_emails", a9);
        h.mo67695b("owner_phones", a10);
        h.mo67695b("owner_postal_address", a11);
        h.mo67695b("circle_members", a12);
        h.mo67695b("gaia_id_map", a13);
        h.mo67695b("applications", a14);
        h.mo67695b("application_packages", a15);
        h.mo67695b("facl_people", a16);
        h.mo67695b("ac_people", a17);
        h.mo67695b("ac_container", a18);
        h.mo67695b("ac_item", a19);
        h.mo67695b("search_index", a20);
        h.mo67695b("ac_index", a21);
        h.mo67695b("properties", a22);
        h.mo67695b("temp_gaia_ordinal", a23);
        return h.mo67618b();
    }

    /* renamed from: b */
    public static bnhe m61756b() {
        String b = alth.m61765b("email_person", "emails", "owner_id", "qualified_id");
        String b2 = alth.m61765b("phone_person", "phones", "owner_id", "qualified_id");
        String b3 = alth.m61765b("postal_address_person", "postal_address", "owner_id", "qualified_id");
        String a = alth.m61760a("search_value", "search_index", "value");
        String a2 = alth.m61760a("search_person_id_index", "search_index", "person_id");
        String a3 = alth.m61760a("ac_index_1", "ac_index", "owner_id", "value", "kind");
        String a4 = alth.m61760a("ac_index_item_id", "ac_index", "item_id");
        String a5 = alth.m61760a("ac_item_container", "ac_item", "container_id");
        String str = "ac_item";
        String a6 = alth.m61760a("ac_item_container_person_id", "ac_container", "people_id");
        String a7 = alth.m61760a("ac_people_v2_id", "ac_people", "owner_id", "people_v2_id");
        bnha h = bnhe.m109414h();
        h.mo67695b("email_person", b);
        h.mo67695b("phone_person", b2);
        h.mo67695b("postal_address_person", b3);
        h.mo67695b("search_value", a);
        h.mo67695b("search_person_id_index", a2);
        h.mo67695b("ac_index_1", a3);
        h.mo67695b("ac_index_item_id", a4);
        h.mo67695b("ac_item_container", a5);
        h.mo67695b("ac_item_container_person_id", a6);
        h.mo67695b("ac_people_v2_id", a7);
        amig.m62939a();
        if (((Boolean) amhf.f74908a.mo41191a()).booleanValue() && !((Boolean) amhg.f74909a.mo41191a()).booleanValue()) {
            h.mo67695b("ac_item_affinity_1", alth.m61760a("ac_item_affinity_1", str, "item_type", "affinity1"));
        }
        return h.mo67618b();
    }

    /* renamed from: c */
    public static bnhe m61757c() {
        String[] strArr = {"p.people_v2_id AS v2_id", "c.container_type AS container_type", "c.profile_type AS profile_type", "coalesce(c.gaia_id,c2.gaia_id) AS gaia_id", "c.contact_id AS contact_id", "c.has_avatar AS has_cp2_avatar", "c.display_name AS display_name", "coalesce(c.compressed_avatar_url,c2.compressed_avatar_url) AS compressed_avatar_url", "p.owner_id AS owner_id", "p.affinity1 AS person_affinity1", "p.affinity2 AS person_affinity2", "p.affinity3 AS person_affinity3", "p.affinity4 AS person_affinity4", "p.affinity5 AS person_affinity5", "p.logging_id AS person_logging_id1", "p.logging_id2 AS person_logging_id2", "p.logging_id3 AS person_logging_id3", "p.logging_id4 AS person_logging_id4", "p.logging_id5 AS person_logging_id5", "i.item_type AS item_type", "i.value AS value", "i.value2 AS value2", "i.value_type AS value_type", "i.custom_label AS custom_label", "i.affinity1 AS item_affinity1", "i.affinity2 AS item_affinity2", "i.affinity3 AS item_affinity3", "i.affinity4 AS item_affinity4", "i.affinity5 AS item_affinity5", "i.logging_id AS item_logging_id1", "i.logging_id2 AS item_logging_id2", "i.logging_id3 AS item_logging_id3", "i.logging_id4 AS item_logging_id4", "i.logging_id5 AS item_logging_id5", "i.certificate_expiration_millis AS item_certificate_expiration_millis", "i.certificate_status AS item_certificate_status", "i._id AS item_id"};
        String format = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT DISTINCT %s FROM %s AS %s JOIN %s AS %s ON %s=%s JOIN %s AS %s ON %s=%s LEFT JOIN %s AS %s ON %s=%s LEFT JOIN (%s) AS %s ON %s=%s WHERE (%s=%s) AND (%s=%s) AND (%s IS NULL OR (%s=coalesce(%s,%s)));", "ac_main_query_view", TextUtils.join(",", strArr), "ac_people", "p", "ac_container", "c", "p._id", "c.people_id", "ac_item", "i", "c._id", "i.container_id", "gaia_id_map", "m", "i.value", "m.value", String.format(Locale.US, "SELECT %s,%s,%s FROM %s WHERE (%s IS NOT NULL)", "people_id", "gaia_id", "compressed_avatar_url", "ac_container", "compressed_avatar_url"), "c2", "c.people_id", "c2.people_id", "c.container_type", 1, "i.item_type", 1, "m.gaia_id", "m.gaia_id", "c.gaia_id", "c2.gaia_id");
        String format2 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s FROM %s AS %s JOIN %s AS %s ON %s=%s JOIN %s AS %s ON %s=%s LEFT JOIN (%s) AS %s ON %s=%s  WHERE (%s=%s) AND (%s=%s);", "ac_main_query_view_legacy", TextUtils.join(",", strArr), "ac_people", "p", "ac_container", "c", "p._id", "c.people_id", "ac_item", "i", "c._id", "i.container_id", String.format(Locale.US, "SELECT %s,%s,%s FROM %s WHERE (%s IS NOT NULL)", "people_id", "gaia_id", "compressed_avatar_url", "ac_container", "compressed_avatar_url"), "c2", "c.people_id", "c2.people_id", "c.container_type", 1, "i.item_type", 1);
        String format3 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s AS %s,%s AS %s,%s AS %s FROM %s WHERE (%s=%s);", "ac_email_exact_index_view", "item_id", "item_id", "owner_id", "owner_id", "value", "value", "ac_index", "kind", 0);
        String format4 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s AS %s,%s AS %s,%s AS %s FROM %s WHERE (%s=%s);", "ac_email_normalized_index_view", "item_id", "item_id", "owner_id", "owner_id", "value", "value", "ac_index", "kind", 1);
        String format5 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s AS %s,%s AS %s,%s AS %s  FROM %s AS %s JOIN %s AS %s ON %s=%s JOIN %s AS %s ON %s=%s WHERE (%s=%s);", "ac_name_search_index_view", "i3._id", "item_id", "x.owner_id", "owner_id", "x.value", "value", "ac_index", "x", "ac_item", "i2", "x.item_id", "i2._id", "ac_item", "i3", "i2.container_id", "i3.container_id", "i2.item_type", 0);
        bnha h = bnhe.m109414h();
        h.mo67695b("ac_main_query_view", format);
        h.mo67695b("ac_main_query_view_legacy", format2);
        h.mo67695b("ac_email_exact_index_view", format3);
        h.mo67695b("ac_email_normalized_index_view", format4);
        h.mo67695b("ac_name_search_index_view", format5);
        return h.mo67618b();
    }
}
